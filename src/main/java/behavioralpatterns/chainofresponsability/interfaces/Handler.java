package behavioralpatterns.chainofresponsability;

public interface Handler {
    void execute(/*Handler next,*/ User user);
}
