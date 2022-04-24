package behavioralpatterns.mediator;

public interface Mediator {
    public void buy(String name, int quantity);
    public void getFromStock(String name, int quantity);
    public void getFromFactory(String name, int quantity);
}
