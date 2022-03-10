package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.Factorys.ArtDecoFurnitureFactory;
import CreationalPatterns.AbstractFactory.Factorys.ModernFurnitureFactory;
import CreationalPatterns.AbstractFactory.Interfaces.FurnitureFactory;

public class Main {
    static FurnitureFactory furnitureFactory;

    public static void setFurnitureFactory(FurnitureFactory factory) {
        furnitureFactory = factory;
    }

    public static void clientFactoryChoice(String choice) {
        switch (choice) {
            case "ArtDeco":
                setFurnitureFactory(new ArtDecoFurnitureFactory());
                break;
            case "Modern":
                setFurnitureFactory(new ModernFurnitureFactory());
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }

    public static void main(String[] args) {
        clientFactoryChoice("ArtDeco");
        furnitureFactory.createChair().hasLegs();
        furnitureFactory.createTable().tableSize();
        furnitureFactory.createSofa().hasSeat();

        clientFactoryChoice("Modern");
        furnitureFactory.createChair().hasLegs();
        furnitureFactory.createTable().tableSize();
        furnitureFactory.createSofa().hasSeat();
    }
}
