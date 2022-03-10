package CreationalPatterns.FactoryMethod.TransportVehicles;

import CreationalPatterns.FactoryMethod.Interfaces.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("---->  Truck is delivering by road  <----");
    }
}
