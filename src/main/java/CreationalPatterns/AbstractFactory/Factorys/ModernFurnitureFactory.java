package CreationalPatterns.AbstractFactory.Factorys;

import CreationalPatterns.AbstractFactory.Interfaces.Chair;
import CreationalPatterns.AbstractFactory.Interfaces.CoffeeTable;
import CreationalPatterns.AbstractFactory.Interfaces.FurnitureFactory;
import CreationalPatterns.AbstractFactory.Interfaces.Sofa;
import CreationalPatterns.AbstractFactory.Products.Chairs.ModernChair;
import CreationalPatterns.AbstractFactory.Products.CoffeeTable.ModernCoffeeTable;
import CreationalPatterns.AbstractFactory.Products.Sofa.ModernSofa;

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
