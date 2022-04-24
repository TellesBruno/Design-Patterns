package behavioralpatterns.mediator;

public class Factory {
    public Product createProduct(String name, int quantity) {
        return new Product(name, quantity);
    }
}
