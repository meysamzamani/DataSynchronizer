package com.meysamzamani.datasynchronizer.utils;

import java.io.IOException;
import java.util.List;

public interface CSVUtility<T> {

    public String generateCSV(List<T> elements, String filePath) throws IOException;

}
