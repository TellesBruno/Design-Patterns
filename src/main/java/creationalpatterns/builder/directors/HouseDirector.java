package creationalpatterns.builder.directors;

import creationalpatterns.builder.interfaces.HouseBuilder;
import creationalpatterns.builder.products.House;

public class HouseDirector {
    public House buildDefaultHouse(HouseBuilder houseBuilder) {

        houseBuilder.buildWalls(6);
        houseBuilder.buildRoof();
        houseBuilder.buildDoors(2);
        houseBuilder.buildWindows(4);
        houseBuilder.buildPool(false);
        houseBuilder.buildGarage(false);


        return houseBuilder.getHouse();
    }
}
