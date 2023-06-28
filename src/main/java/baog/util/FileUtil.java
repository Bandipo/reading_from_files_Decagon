package baog.util;



import baog.enums.ProductCategory;
import baog.models.Person;
import baog.models.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtil implements FileUtilService {


    @Override
    public List<Person> convertCsvLinesToPersons(List<String> personData) {
        List<Person> persons = new ArrayList<>();

        for(String line: personData){

            //split each line to get the members
            String[] personElements = line.split(",");
            System.out.println("PersonElement: "+ Arrays.toString(personElements));

            // get each data for person
            String firstName = personElements[0];
            String lastName = personElements[1];
            int age = Integer.parseInt(personElements[2]);

            Person person = new Person(firstName, lastName, age);

            persons.add(person);
        }

        return persons;
    }

    @Override
    public List<Product> convertCsvLinesToProducts(List<String> productData) {
        List<Product> products = new ArrayList<>();

        productData
                .forEach(line ->{
                    String[] productElements = line.split(",");

                    long id = Long.parseLong(productElements[0]);
                    String name = productElements[1];
                    ProductCategory category = ProductCategory.valueOf(productElements[2]);
                    int quantity = Integer.parseInt(productElements[3]);

                    Product product = new Product(id, name, category, quantity);

                    products.add(product);
                });

        return products;
    }
}
