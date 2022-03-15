package creationalpatterns.abstractfactory.products.Sofa;

import creationalpatterns.abstractfactory.interfaces.Sofa;

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
