package creationalpatterns.factorymethod.logistics;

import creationalpatterns.factorymethod.transportvehicles.Ship;

public class SeaLogistics extends BasicLogistics {
    @Override
    public Ship createTransport() {
        return new Ship();
    }
}
