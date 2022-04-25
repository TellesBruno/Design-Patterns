package behavioralpatterns.mediator.suppliers;

import behavioralpatterns.mediator.products.Product;

public class Factory {
    public Product createProduct(String name, int quantity) {
        return new Product(name, quantity);
    }
}
