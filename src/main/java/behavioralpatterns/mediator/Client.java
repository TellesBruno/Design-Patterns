package behavioralpatterns.mediator;

public class Client {

    public void buy(Mediator mediator, String name, int quantity) {
        mediator.buy(name, quantity);
    }
}
