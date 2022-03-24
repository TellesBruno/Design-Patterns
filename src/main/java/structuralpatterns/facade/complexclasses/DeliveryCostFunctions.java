package structuralpatterns.facade.complexclasses;

public class DeliveryCostFunctions {
    public double basicConst(double weight, double distance) {
        final double BASIC_VALUE_PER_KILOMETER = 0.25;
        final double BASIC_VALUE_PER_KILOGRAM = 0.15;
        return BASIC_VALUE_PER_KILOGRAM * weight + BASIC_VALUE_PER_KILOMETER * distance;
    }

    public double weightDeliveryCost(double price, double weight) {
        double weightBonus;
        if (weight > 10 && weight <= 20) {
            weightBonus = 0.1;
        } else {
            if (weight > 20) {
            weightBonus = 0.2;
            } else {
                weightBonus = 0;
        }}
        return price * weightBonus;
    }

    public double distantDeliveryCost(double price, double distance) {
        double distanceBonus;
        if (distance > 20 && distance <= 30) {
            distanceBonus = 0.1;
        } else {
            if (distance > 30) {
                distanceBonus = 0.2;
            } else {
                distanceBonus = 0;
            }
        }
        return price * distanceBonus;
    }

    public double sizeDeliveryCost(double price, String size) {
        double sizeBonus = switch (size) {
            case "Large" -> 1.2;
            case "Medium" -> 1.1;
            default -> 1;
        };
        return price * sizeBonus;
    }

    public double fragileDeliveryCost(double price) {
        final double FRAGILE_DELIVERY_PRICE = 1.1;
        return price * FRAGILE_DELIVERY_PRICE;
    }

}
