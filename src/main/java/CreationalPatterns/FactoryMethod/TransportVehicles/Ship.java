package CreationalPatterns.FactoryMethod.TransportVehicles;

import CreationalPatterns.FactoryMethod.Interfaces.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("---->  Ship is delivering by sea  <----");
    }
}
