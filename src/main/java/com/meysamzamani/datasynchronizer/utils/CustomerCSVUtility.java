package com.meysamzamani.datasynchronizer.utils;

import com.meysamzamani.datasynchronizer.domain.customer.Customer;
import com.opencsv.CSVWriter;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Component
public class CustomerCSVUtility implements CSVUtility<Customer> {

    @Override
    public String generateCSV(List<Customer> customers, String filePath) throws IOException {

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {

            String[] header = {
                    "Firma", "Strasse", "Strassenzusatz", "Ort", "Land", "PLZ", "Vorname", "Nachname",
                    "Kunden-ID"
            };
            writer.writeNext(header);

            for (Customer customer : customers) {
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
        }

        return filePath;
    }

}
