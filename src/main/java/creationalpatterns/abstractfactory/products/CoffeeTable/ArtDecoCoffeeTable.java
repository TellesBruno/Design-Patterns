package creationalpatterns.abstractfactory.products.CoffeeTable;

import creationalpatterns.abstractfactory.interfaces.CoffeeTable;

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
