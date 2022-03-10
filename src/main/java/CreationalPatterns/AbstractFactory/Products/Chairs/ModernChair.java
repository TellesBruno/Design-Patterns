package CreationalPatterns.AbstractFactory.Products.Chairs;

import CreationalPatterns.AbstractFactory.Interfaces.Chair;

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
