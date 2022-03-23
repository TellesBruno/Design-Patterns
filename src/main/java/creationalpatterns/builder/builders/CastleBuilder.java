package creationalpatterns.builder.builders;

import creationalpatterns.builder.products.House;
import creationalpatterns.builder.interfaces.HouseBuilder;

public class CastleBuilder implements HouseBuilder {
    House castle = new House();

    @Override
    public void buildWalls(Integer wallNunber) {
        castle.setWall("Stone walls");
        castle.setWallNunber(wallNunber);
    }

    @Override
    public void buildDoors(Integer doorNumber) {
        castle.setDoor("Heavy wood doors");
        castle.setDoorNunber(doorNumber);
    }

    @Override
    public void buildWindows(Integer windowNumber) {
        castle.setWindow("Castle windows");
        castle.setWindowNunber(windowNumber);
    }

    @Override
    public void buildRoof() {
        castle.setRoof("Castle stone roof");
    }

    @Override
    public void buildGarage(Boolean hasGarage) {
        castle.setGarage(hasGarage);
    }

    @Override
    public void buildPool(Boolean hasPool) {
        castle.setPool(hasPool);
    }

    @Override
    public House getHouse() {
        return castle;
    }
}
