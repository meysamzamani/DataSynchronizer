package com.meysamzamani.datasynchronizer.application;

import com.meysamzamani.datasynchronizer.domain.customer.Customer;
import com.meysamzamani.datasynchronizer.domain.customer.CustomerSyncInformation;
import com.meysamzamani.datasynchronizer.infrastructure.database.CustomerRepository;
import com.meysamzamani.datasynchronizer.infrastructure.database.CustomerSyncInformationRepository;
import com.meysamzamani.datasynchronizer.presentation.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerSyncInformationRepository customerSyncInformationRepository;

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

    public void syncCustomerToStorage() {
        Optional<CustomerSyncInformation> customerSyncInformation = customerSyncInformationRepository.findTopByOrderByIdAsc();
        if (customerSyncInformation.isPresent()) {
            // TODO: Develop feature to sync data to S3 storage from offset
            System.out.println("Sync Customer to Storage from offset");
        } else {
            // TODO: Develop feature to sync data to S3 storage from scratch
            System.out.println("Sync Customer to Storage from scratch");
        }
    }

}
