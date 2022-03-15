package creationalpatterns.factorymethod.transportvehicles;

import creationalpatterns.factorymethod.interfaces.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("---->  Ship is delivering by sea  <----");
    }
}
