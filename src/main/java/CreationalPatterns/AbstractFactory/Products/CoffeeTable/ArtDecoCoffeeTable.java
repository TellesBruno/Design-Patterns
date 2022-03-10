package CreationalPatterns.AbstractFactory.Products.CoffeeTable;

import CreationalPatterns.AbstractFactory.Interfaces.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("ArtDecoCoffeeTable has no legs");
    }

    @Override
    public void tableSize() {
        System.out.println("ArtDecoCoffeeTable size is large");
    }
}
