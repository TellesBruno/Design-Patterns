package creationalpatterns.abstractfactory.factorys;

import creationalpatterns.abstractfactory.interfaces.Chair;
import creationalpatterns.abstractfactory.interfaces.CoffeeTable;
import creationalpatterns.abstractfactory.interfaces.FurnitureFactory;
import creationalpatterns.abstractfactory.interfaces.Sofa;
import creationalpatterns.abstractfactory.products.Chairs.ModernChair;
import creationalpatterns.abstractfactory.products.CoffeeTable.ModernCoffeeTable;
import creationalpatterns.abstractfactory.products.Sofa.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
