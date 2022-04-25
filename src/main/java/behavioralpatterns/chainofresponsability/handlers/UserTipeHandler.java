package behavioralpatterns.chainofresponsability.handlers;

import behavioralpatterns.chainofresponsability.interfaces.Handler;
import behavioralpatterns.chainofresponsability.clients.User;

import java.util.Objects;

public class UserTipeHandler implements Handler {
    CoffeMachineHandler next = new CoffeMachineHandler();

    @Override
    public void execute(User user) {
        if(Objects.equals(user.getType(), "teacher")){
            next.execute(user);
        } else {
            if (Objects.equals(user.getType(), "student") && user.getCoffeCredit() > 0){
                user.setCoffeCredit(user.getCoffeCredit() - 1);
                next.execute(user);
            } else {
                System.out.println("User doesn't have enough credit");
            }
        }
    }
}
