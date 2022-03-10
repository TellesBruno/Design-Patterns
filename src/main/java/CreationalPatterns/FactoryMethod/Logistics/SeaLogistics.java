package CreationalPatterns.FactoryMethod.Logistics;

import CreationalPatterns.FactoryMethod.TransportVehicles.Ship;

public class SeaLogistics extends BasicLogistics {
    @Override
    public Ship createTransport() {
        return new Ship();
    }
}
