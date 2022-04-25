package structuralpatterns.decorator.decorators;

import structuralpatterns.decorator.interfaces.Notificator;
import structuralpatterns.decorator.clients.User;

public class BasicNotificatorDecorator implements Notificator {
    private Notificator notificator;

    @Override
    public void sendNotification(String message, User user) {
        notificator.sendNotification(message, user);
    }
}
