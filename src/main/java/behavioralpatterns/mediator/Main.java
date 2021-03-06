package behavioralpatterns.mediator;

import behavioralpatterns.mediator.clients.Client;
import behavioralpatterns.mediator.interfaces.Mediator;
import behavioralpatterns.mediator.marketstock.Stock;
import behavioralpatterns.mediator.mediators.MarcketMediator;
import behavioralpatterns.mediator.products.Product;
import behavioralpatterns.mediator.suppliers.Factory;

public class Main {
    static Client client = new Client();
    static Factory factory = new Factory();
    static Mediator mediator = new MarcketMediator(createStock(), factory);

    public static Stock createStock() {
        Stock stock = new Stock();
        stock.addProduct(new Product("Box", 5));
        stock.addProduct(new Product("Pen", 10));
        stock.addProduct(new Product("Book", 20));
        return stock;
    }
    public static void main(String[] args) {
        client.buy(mediator, "Box", 3);
        client.buy(mediator, "Box", 3);
    }
}
