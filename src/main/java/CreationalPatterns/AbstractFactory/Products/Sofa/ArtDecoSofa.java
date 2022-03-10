package CreationalPatterns.AbstractFactory.Products.Sofa;

import CreationalPatterns.AbstractFactory.Interfaces.Sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("ArtDecoSofa has no legs");
    }

    @Override
    public void hasSeat() {
        System.out.println("ArtDecoSofa has 2 seats");
    }
}
