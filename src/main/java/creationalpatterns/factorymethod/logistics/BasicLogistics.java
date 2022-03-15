package creationalpatterns.factorymethod.logistics;

import creationalpatterns.factorymethod.interfaces.Transport;

public abstract class BasicLogistics {
    public abstract Transport createTransport();

    public void deliver(){
        Transport transport = createTransport();
        transport.deliver();
    }
}
