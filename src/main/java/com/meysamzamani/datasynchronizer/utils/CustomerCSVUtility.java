package com.meysamzamani.datasynchronizer.utils;

import com.meysamzamani.datasynchronizer.domain.customer.Customer;
import com.opencsv.CSVWriter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Component
public class CustomerCSVUtility implements CSVUtility<Customer> {

    @Override
    public List<String> generateCSV(List<Customer> customers, Path filePath) throws IOException {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(dateTimeFormatter);
        List<String> filePaths = new ArrayList<>();

        for (Map.Entry<String, List<Customer>> entry : makeGroupedCustomerByCountry(customers).entrySet()) {
            String country = entry.getKey();
            List<Customer> customerList = entry.getValue();
            String fileName = filePath + "/" + country + " " + time + ".csv";

            try (CSVWriter writer = new CSVWriter(new FileWriter(fileName))) {

                String[] header = {
                        "Firma", "Strasse", "Strassenzusatz", "Ort", "Land", "PLZ", "Vorname", "Nachname",
                        "Kunden-ID"
                };
                writer.writeNext(header);

                for (Customer customer : customerList) {
                    String[] data = {
                            customer.getFirmenName(),
                            customer.getStrasse(),
                            customer.getStrassenZusatz(),
                            customer.getOrt(),
                            customer.getLand(),
                            customer.getPlz(),
                            customer.getVorName(),
                            customer.getNachName(),
                            String.valueOf(customer.getKundenId())
                    };
                    writer.writeNext(data);
                }
                writer.flush();
                filePaths.add(fileName);
            }

        }

        return filePaths;
    }

    private Map<String, List<Customer>> makeGroupedCustomerByCountry(List<Customer> customers) {
        Map<String, List<Customer>> groupedCustomerByCountry = new LinkedCaseInsensitiveMap<>();
        customers.forEach(customer -> {
            String country = customer.getLand();
            groupedCustomerByCountry.computeIfAbsent(country, k -> new ArrayList<>()).add(customer);
        });
        return groupedCustomerByCountry;
    }

}
