package creationalpatterns.abstractfactory.interfaces;

public interface FurnitureFactory {
    public Chair createChair();
    public CoffeeTable createTable();
    public Sofa createSofa();
}
