package structuralpatterns.decorator;

import structuralpatterns.decorator.clients.User;
import structuralpatterns.decorator.decorators.BasicNotificatorDecorator;
import structuralpatterns.decorator.decorators.EmailNotificatorDecorator;
import structuralpatterns.decorator.decorators.PushNotificatorDecorator;
import structuralpatterns.decorator.decorators.SmsNotificatorDecorator;

import java.util.*;

public class Main {
    static User user1 = new User("João",
            123,
            "joao@email.com",
            "9999999999",
            true, true, true);

    static User user2 = new User("Maria",
            321,
            "maria@email.com",
            "9888888888",
            false, true, true);

    public static void userNotificationValidation(User user){
        Deque<BasicNotificatorDecorator> notificatorsStack = new ArrayDeque<>();
        if(user.isEnablePush()){
            notificatorsStack.push(new PushNotificatorDecorator());
        }
        if(user.isEnableEmail()){
            notificatorsStack.push(new EmailNotificatorDecorator());
        }
        if(user.isEnableSms()){
            notificatorsStack.push(new SmsNotificatorDecorator());
        }
        if(user.isEnableEmail() && user.isEnableSms()){
            notificatorsStack.push(new EmailNotificatorDecorator());
            notificatorsStack.push(new SmsNotificatorDecorator());
        }
        for (BasicNotificatorDecorator notificator : notificatorsStack) {
            notificator.sendNotification("Hello World!", user);
        }
    }

    public static void main(String[] args) {
        userNotificationValidation(user1);
        userNotificationValidation(user2);
    }
}
