package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.Logistics.BasicLogistics;
import CreationalPatterns.FactoryMethod.Logistics.RoadLogistics;
import CreationalPatterns.FactoryMethod.Logistics.SeaLogistics;

public class Main {
    public static BasicLogistics logistics;

    public static void selectLogistics(String logisticsType) {
        switch (logisticsType) {
            case "Truck":
                logistics = new RoadLogistics();
                break;
            case "Ship":
                logistics = new SeaLogistics();
            default:
                System.out.println("Invalid logistics type");
                break;
        }
    }

    public static void main(String[] args) {
        selectLogistics("Ship");
        logistics.deliver();
    }
}
