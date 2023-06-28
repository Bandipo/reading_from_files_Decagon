package baog.util;

import baog.models.Person;
import baog.models.Product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public interface FileUtilService {

    List<Person> convertCsvLinesToPersons(List<String> personData);
    List<Product> convertCsvLinesToProducts(List<String> productData);
    default
     List<String> readFromCsvFile(String csvFile) {

        try {
            return Files.readAllLines(Paths.get(csvFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
