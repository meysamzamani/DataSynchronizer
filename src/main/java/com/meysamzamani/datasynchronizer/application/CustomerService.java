package com.meysamzamani.datasynchronizer.application;

import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.meysamzamani.datasynchronizer.domain.customer.Customer;
import com.meysamzamani.datasynchronizer.domain.customer.CustomerSyncInformation;
import com.meysamzamani.datasynchronizer.infrastructure.database.CustomerRepository;
import com.meysamzamani.datasynchronizer.infrastructure.database.CustomerSyncInformationRepository;
import com.meysamzamani.datasynchronizer.infrastructure.storage.S3Manager;
import com.meysamzamani.datasynchronizer.presentation.exception.NotFoundException;
import com.meysamzamani.datasynchronizer.utils.CSVUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private S3Manager s3Manager;

    @Autowired
    private CustomerSyncInformationRepository customerSyncInformationRepository;

    @Autowired
    private CSVUtility<Customer> customerCSVUtility;

    @Value("${com.meysamzamani.data_synchronizer.location}")
    private Path location;

    @Value("${com.meysamzamani.data_synchronizer.storage.bucket}")
    private String bucket;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long customerId) {
        return customerRepository.findById(customerId).orElseThrow(
                () -> new NotFoundException("Customer with ID " + customerId + " not found.")
        );
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(
                () -> new NotFoundException("Customer with ID " + customerId + " not found.")
        );
        customerRepository.delete(customer);
    }

    public void findNewCustomerAndSync() {
        Optional<CustomerSyncInformation> customerSyncInformation = customerSyncInformationRepository.findTopByOrderByIdAsc();

        List<Customer> customers;
        if (customerSyncInformation.isPresent()) {
            if (customerSyncInformation.get().isActive()) {
                return;
            }
            customers = customerRepository.findByKundenIdGreaterThan(customerSyncInformation.get().getMaxCustomerId());
        } else {
            customers = getCustomers();
        }
        syncCustomerToStorage(customers);
    }

    private void syncCustomerToStorage(List<Customer> customers) {
        Long maxId = findMaximumId(customers);
        CustomerSyncInformation savedCustomerSyncInfo = customerSyncInformationRepository.save(
                new CustomerSyncInformation(LocalDate.now(), maxId, "", bucket, true)
        );
        try {
            String filePath = customerCSVUtility.generateCSV(customers, getLocation()+"test.csv");

            savedCustomerSyncInfo.setFilePath(filePath);
            customerSyncInformationRepository.save(savedCustomerSyncInfo);

            PutObjectResult result = s3Manager.putObject(bucket, filePath, new File(filePath));
        } catch (IOException | AmazonS3Exception e) {
            customerSyncInformationRepository.delete(savedCustomerSyncInfo);
        } finally {
            savedCustomerSyncInfo.setActive(false);
            customerSyncInformationRepository.save(savedCustomerSyncInfo);
        }
    }

    private Long findMaximumId(List<Customer> customers) {
        return Collections.max(customers).getKundenId();
    }

    private Path getLocation() {
        String userDirectory = new File("").getAbsolutePath();
        return Paths.get(userDirectory+location);
    }

}
