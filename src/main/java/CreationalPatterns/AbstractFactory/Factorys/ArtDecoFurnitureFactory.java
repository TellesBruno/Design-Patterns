package CreationalPatterns.AbstractFactory.Factorys;

import CreationalPatterns.AbstractFactory.Interfaces.Chair;
import CreationalPatterns.AbstractFactory.Interfaces.CoffeeTable;
import CreationalPatterns.AbstractFactory.Interfaces.FurnitureFactory;
import CreationalPatterns.AbstractFactory.Interfaces.Sofa;
import CreationalPatterns.AbstractFactory.Products.Chairs.ArtDecoChair;
import CreationalPatterns.AbstractFactory.Products.CoffeeTable.ArtDecoCoffeeTable;
import CreationalPatterns.AbstractFactory.Products.Sofa.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
