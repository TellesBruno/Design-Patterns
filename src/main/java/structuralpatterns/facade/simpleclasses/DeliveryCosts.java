package structuralpatterns.facade.simpleclasses;

import structuralpatterns.facade.complexclasses.DeliveryCostFunctions;
import structuralpatterns.facade.products.Box;

public class DeliveryCosts {
    public double getTotalCost(Box box, Double distance) {
        final DeliveryCostFunctions costCalculator = new DeliveryCostFunctions();
        double totalCost;

        totalCost = costCalculator.basicConst(box.getWeight(), distance);
        totalCost += costCalculator.weightDeliveryCost(totalCost, box.getWeight());
        totalCost += costCalculator.distantDeliveryCost(totalCost, distance);
        totalCost += costCalculator.sizeDeliveryCost(totalCost, box.getSize());
        if (box.isFragile()) {
            totalCost += costCalculator.fragileDeliveryCost(totalCost);
        }

        return totalCost;
    }
}
