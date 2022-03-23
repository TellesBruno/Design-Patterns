package creationalpatterns.builder.interfaces;

import creationalpatterns.builder.products.House;

public interface HouseBuilder {
    void buildWalls(Integer wallNunber);
    void buildDoors(Integer doorNumber);
    void buildWindows(Integer windowNumber);
    void buildRoof();
    void buildGarage(Boolean hasGarage);
    void buildPool(Boolean hasPool);
    House getHouse();
}
