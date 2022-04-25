package behavioralpatterns.chainofresponsability.handlers;

import behavioralpatterns.chainofresponsability.interfaces.Handler;
import behavioralpatterns.chainofresponsability.clients.User;

import java.util.ArrayList;
import java.util.List;

public class UserAuthenticationHandlers implements Handler {
    UserTipeHandler next = new UserTipeHandler();

    @Override
    public void execute(User user) {
        boolean userExists = false;
        List<User> userList = new ArrayList<>();
        userList.add(new User("Joao", "password", "student",0));
        userList.add(new User("Maria", "password", "teacher",-1));
        userList.add(new User("Lucas", "password", "student",5));
        for (User u : userList) {
            if(u.getUserName().equals(user.getUserName()) && u.getPassword().equals(user.getPassword())){
                userExists = true;
                next.execute(u);
            }
        }
        if(!userExists){
            System.out.println("User not found");
        }
    }
}
