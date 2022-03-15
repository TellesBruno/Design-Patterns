package creationalpatterns.abstractfactory.products.Chairs;

import creationalpatterns.abstractfactory.interfaces.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("ArtDecoChair has 4 small legs");
    }

    @Override
    public void sitOn() {
        System.out.println("ArtDecoChair has 1 space to sit on");
    }
}
