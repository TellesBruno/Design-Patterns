package creationalpatterns.abstractfactory.factorys;

import creationalpatterns.abstractfactory.interfaces.Chair;
import creationalpatterns.abstractfactory.interfaces.CoffeeTable;
import creationalpatterns.abstractfactory.interfaces.FurnitureFactory;
import creationalpatterns.abstractfactory.interfaces.Sofa;
import creationalpatterns.abstractfactory.products.Chairs.ArtDecoChair;
import creationalpatterns.abstractfactory.products.CoffeeTable.ArtDecoCoffeeTable;
import creationalpatterns.abstractfactory.products.Sofa.ArtDecoSofa;

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
