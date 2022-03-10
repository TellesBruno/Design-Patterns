package CreationalPatterns.FactoryMethod.Logistics;

import CreationalPatterns.FactoryMethod.Interfaces.Transport;

public abstract class BasicLogistics {
    public abstract Transport createTransport();

    public void deliver(){
        Transport transport = createTransport();
        transport.deliver();
    }
}
