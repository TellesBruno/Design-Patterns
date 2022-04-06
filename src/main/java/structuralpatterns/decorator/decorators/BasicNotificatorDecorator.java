package structuralpatterns.decorator;

public class BasicNotificatorDecorator implements Notificator {
    private Notificator notificator;

    @Override
    public void sendNotification(String message, User user) {
        notificator.sendNotification(message, user);
    }
}
