package structuralpatterns.decorator.interfaces;

import structuralpatterns.decorator.clients.User;

public interface Notificator {
    void sendNotification(String message, User user);
}
