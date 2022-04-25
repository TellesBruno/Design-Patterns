package behavioralpatterns.mediator.marketstock;

import behavioralpatterns.mediator.products.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Stock {
    private List<Product> products = new ArrayList<>();

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
