package creationalpatterns.abstractfactory.products.Chairs;

import creationalpatterns.abstractfactory.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("ModernChair has no legs");
    }

    @Override
    public void sitOn() {
        System.out.println("ModernChair has 1 space to sit on");
    }
}
