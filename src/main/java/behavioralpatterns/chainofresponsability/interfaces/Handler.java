package behavioralpatterns.chainofresponsability.interfaces;

import behavioralpatterns.chainofresponsability.clients.User;

public interface Handler {
    void execute(/*Handler next,*/ User user);
}
