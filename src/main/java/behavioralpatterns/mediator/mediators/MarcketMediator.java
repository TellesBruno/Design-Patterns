package behavioralpatterns.mediator.mediators;

import behavioralpatterns.mediator.suppliers.Factory;
import behavioralpatterns.mediator.products.Product;
import behavioralpatterns.mediator.marketstock.Stock;
import behavioralpatterns.mediator.interfaces.Mediator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MarcketMediator implements Mediator {
    private Stock stock;
    private Factory factory;

    @Override
    public void buy(String name, int quantity) {
        for(Product product: stock.getProducts()){
            if(product.getName().equals(name)){
                if(product.getQuantity()>=quantity) {
                    stock.removeFromStock(name, quantity);
                    System.out.println("Produto vindo do estoque!");
                    break;
                } else {
                    getFromFactory(name, quantity);
                }
            }
        }
    }

    @Override
    public void getFromStock(String name, int quantity) {

    }

    @Override
    public void getFromFactory(String name, int quantity) {
        System.out.println("Getting from factory: " + name + " " + quantity + " units");
        factory.createProduct(name, quantity);
        System.out.println("Produto vindo da fábrica!");
    }
}
