package creationalpatterns.abstractfactory.products.CoffeeTable;

import creationalpatterns.abstractfactory.interfaces.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("ModernCoffeeTable has 4 small legs");
    }

    @Override
    public void tableSize() {
        System.out.println("ModernCoffeeTable size is medium");
    }
}
