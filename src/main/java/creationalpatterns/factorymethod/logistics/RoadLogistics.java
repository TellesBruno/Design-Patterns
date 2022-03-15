package creationalpatterns.factorymethod.logistics;

import creationalpatterns.factorymethod.transportvehicles.Truck;

public class RoadLogistics extends BasicLogistics {
    @Override
    public Truck createTransport() {
        return new Truck();
    }
}
