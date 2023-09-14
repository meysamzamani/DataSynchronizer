package com.meysamzamani.datasynchronizer.configuration;

import com.meysamzamani.datasynchronizer.infrastructure.database.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataSyncConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository) {
        return args -> {
            //repository.saveAll(List.of());
        };
    }

}
