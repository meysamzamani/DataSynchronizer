package com.meysamzamani.datasynchronizer.utils;

import org.springframework.stereotype.Component;

@Component
public class CSVFileGenerator {

     private static CSVFileGenerator instance;

     private CSVFileGenerator() {}

     public static synchronized CSVFileGenerator getInstance() {
         if (instance == null) {
             instance = new CSVFileGenerator();
         }
         return instance;
     }

}
