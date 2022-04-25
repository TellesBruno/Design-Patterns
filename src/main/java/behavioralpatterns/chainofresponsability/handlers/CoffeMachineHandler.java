package behavioralpatterns.chainofresponsability.handlers;

import behavioralpatterns.chainofresponsability.interfaces.Handler;
import behavioralpatterns.chainofresponsability.clients.User;

public class CoffeMachineHandler implements Handler {
    @Override
    public void execute(User user) {
        System.out.println("Enjoy your coffee " + user.getUserName()+ "!");
    }
}
