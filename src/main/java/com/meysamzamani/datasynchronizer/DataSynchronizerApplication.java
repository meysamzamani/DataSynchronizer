package com.meysamzamani.datasynchronizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataSynchronizerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataSynchronizerApplication.class, args);
    }

}
