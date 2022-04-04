package structuralpatterns.facade;

import structuralpatterns.facade.products.Box;
import structuralpatterns.facade.facade.DeliveryCostsFacade;

public class Main {
    static final DeliveryCostsFacade deliveryCost = new DeliveryCostsFacade();
    public static void main(String[] args) {
        Box firstBox = new Box("Large", 40.00, false);
        Box secondBox = new Box("Medium", 20.00, true);
        Box thirdBox = new Box("Small", 5.00, false);

        double firstBoxCost = deliveryCost.getTotalCost(firstBox, 12.4);
        double secondBoxCost = deliveryCost.getTotalCost(secondBox, 18.3);
        double thirdBoxCost = deliveryCost.getTotalCost(thirdBox, 50.1);

        System.out.println("First Box: " + firstBoxCost);
        System.out.println("Second Box: " + secondBoxCost);
        System.out.println("Third Box: " + thirdBoxCost);
    }
}
