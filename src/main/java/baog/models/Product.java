package baog.models;

import baog.enums.ProductCategory;
import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private long id;
    private String name;
    private ProductCategory productCategory;

    private int quantity;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name) && productCategory == product.productCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, productCategory);
    }
}
