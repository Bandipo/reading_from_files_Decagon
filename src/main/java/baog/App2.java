package baog;

import baog.models.Person;
import baog.util.FileUtil;
import baog.util.FileUtilService;

import java.util.List;


public class App2 {

   static FileUtilService fileUtilService = new FileUtil();

    public static void main(String[] args) {
        final String productCsvFile = "src/main/resources/product.csv";
        final String personCsvFile = "src/main/resources/person.csv";

        //reading from product csv
        List<String> productData = fileUtilService.readFromCsvFile(productCsvFile);
        fileUtilService.convertCsvLinesToProducts(productData)
                .forEach(System.out::println);


        //reading from person csv
        List<String> personData = fileUtilService.readFromCsvFile(personCsvFile);
        List<Person> persons = fileUtilService.convertCsvLinesToPersons(personData);



    }



}
