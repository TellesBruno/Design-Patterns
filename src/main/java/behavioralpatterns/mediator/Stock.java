package behavioralpatterns.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Stock {
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeFromStock(String name, int quantity) {
        for(Product product : products) {
            if(product.getName().equals(name)) {
                product.setQuantity(product.getQuantity() - quantity);
            }
        }
    }
}
