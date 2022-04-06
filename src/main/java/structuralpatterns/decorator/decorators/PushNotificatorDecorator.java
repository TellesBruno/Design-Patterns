package structuralpatterns.decorator;

public class PushNotificatorDecorator extends BasicNotificatorDecorator {
    public void sendNotification(String message, User user) {
        System.out.println("Push notification to User ID "+ user.getId()+ ": " + message);
    }
}
