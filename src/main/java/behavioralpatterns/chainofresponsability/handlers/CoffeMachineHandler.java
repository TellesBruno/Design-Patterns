package behavioralpatterns.chainofresponsability;

public class CoffeMachineHandler implements Handler {
    @Override
    public void execute(User user) {
        System.out.println("Enjoy your coffee " + user.getUserName()+ "!");
    }
}
