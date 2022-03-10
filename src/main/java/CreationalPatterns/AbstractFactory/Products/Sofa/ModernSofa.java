package CreationalPatterns.AbstractFactory.Products.Sofa;

import CreationalPatterns.AbstractFactory.Interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("ModernSofa has 4 small legs");
    }

    @Override
    public void hasSeat() {
        System.out.println("ModernSofa has 2 seats");
    }
}
