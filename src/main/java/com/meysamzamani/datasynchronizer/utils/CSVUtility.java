package com.meysamzamani.datasynchronizer.utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface CSVUtility<T> {

    List<String> generateCSV(List<T> elements, Path filePath) throws IOException;

}
