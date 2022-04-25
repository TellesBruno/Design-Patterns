package behavioralpatterns.mediator.clients;

import behavioralpatterns.mediator.interfaces.Mediator;

public class Client {

    public void buy(Mediator mediator, String name, int quantity) {
        mediator.buy(name, quantity);
    }
}
