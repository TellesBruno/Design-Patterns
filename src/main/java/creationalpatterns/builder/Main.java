package creationalpatterns.builder;

import creationalpatterns.builder.builders.CastleBuilder;
import creationalpatterns.builder.builders.StandardBuilder;
import creationalpatterns.builder.interfaces.HouseBuilder;
import creationalpatterns.builder.products.House;

public class Main {
    static HouseBuilder builder;

    public static void setBuilder(HouseBuilder b) {
        builder = b;
    }

    public static void clientBuilderChoice (String choice) {
        switch (choice) {
            case "Castle":
                setBuilder(new CastleBuilder());
                break;
            case "Standard":
                setBuilder(new StandardBuilder());
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static void main(String[] args) {
        House castleHouse;
        House standardHouse;

        clientBuilderChoice("Castle");
        builder.buildWalls(4);
        builder.buildRoof();
        builder.buildWindows(4);
        builder.buildDoors(2);
        castleHouse = builder.getHouse();
        System.out.println(castleHouse);

        clientBuilderChoice("Standard");
        builder.buildWalls(4);
        builder.buildRoof();
        builder.buildWindows(4);
        builder.buildDoors(2);
        builder.buildGarage(true);
        builder.buildPool(true);
        standardHouse = builder.getHouse();
        System.out.println(standardHouse);
    }
}
