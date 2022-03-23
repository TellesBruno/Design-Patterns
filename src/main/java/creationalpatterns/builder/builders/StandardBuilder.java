package creationalpatterns.builder.builders;

import creationalpatterns.builder.products.House;
import creationalpatterns.builder.interfaces.HouseBuilder;

public class StandardBuilder implements HouseBuilder {
    House house = new House();

    @Override
    public void buildWalls(Integer wallNunber) {
        house.setWall("Brick walls");
        house.setWallNunber(wallNunber);
    }

    @Override
    public void buildDoors(Integer doorNumber) {
        house.setDoor("Standard wood doors");
        house.setDoorNunber(doorNumber);
    }

    @Override
    public void buildWindows(Integer windowNumber) {
        house.setWindow("Venetian windows");
        house.setWindowNunber(windowNumber);
    }

    @Override
    public void buildRoof() {
        house.setRoof("Standard roof");
    }

    @Override
    public void buildGarage(Boolean hasGarage) {
        house.setGarage(hasGarage);
    }

    @Override
    public void buildPool(Boolean hasPool) {
        house.setPool(hasPool);
    }

    @Override
    public House getHouse() {
        if (house.getGarage() == null) {
            house.setGarage(false);
        }
        if (house.getPool() == null) {
            house.setPool(false);
        }
        return house;
    }
}
