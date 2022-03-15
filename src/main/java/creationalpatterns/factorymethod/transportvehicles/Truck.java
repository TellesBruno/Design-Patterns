package creationalpatterns.factorymethod.transportvehicles;

import creationalpatterns.factorymethod.interfaces.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("---->  Truck is delivering by road  <----");
    }
}
