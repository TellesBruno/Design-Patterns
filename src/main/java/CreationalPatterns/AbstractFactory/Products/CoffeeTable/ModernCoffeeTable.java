package CreationalPatterns.AbstractFactory.Products.CoffeeTable;

import CreationalPatterns.AbstractFactory.Interfaces.CoffeeTable;

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
