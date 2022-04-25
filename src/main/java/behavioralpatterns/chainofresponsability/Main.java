package behavioralpatterns.chainofresponsability;

import behavioralpatterns.chainofresponsability.clients.User;
import behavioralpatterns.chainofresponsability.handlers.UserAuthenticationHandlers;

public class Main {
    static UserAuthenticationHandlers userAuthenticationHandlers = new UserAuthenticationHandlers();

    public static User loggin(String userName, String password) {
        return new User(userName, password, "undefined", 0);
    }

    public static void main(String[] args) {
        userAuthenticationHandlers.execute(loggin("Joao", "password"));
    }
}
