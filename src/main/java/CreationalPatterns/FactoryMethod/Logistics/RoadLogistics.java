package CreationalPatterns.FactoryMethod.Logistics;

import CreationalPatterns.FactoryMethod.TransportVehicles.Truck;

public class RoadLogistics extends BasicLogistics {
    @Override
    public Truck createTransport() {
        return new Truck();
    }
}
