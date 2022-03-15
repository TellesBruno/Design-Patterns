package creationalpatterns.abstractfactory.products.Sofa;

import creationalpatterns.abstractfactory.interfaces.Sofa;

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
