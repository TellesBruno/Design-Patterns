package structuralpatterns.decorator.decorators;

import structuralpatterns.decorator.clients.User;

public class EmailNotificatorDecorator extends BasicNotificatorDecorator {
    public void sendNotification(String message, User user) {
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
    }
}
