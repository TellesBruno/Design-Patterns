package structuralpatterns.decorator;

public class SmsNotificatorDecorator extends BasicNotificatorDecorator {
    public void sendNotification(String message, User user) {
        System.out.println("Sending SMS to " + user.getPhone() + ": " + message);
    }
}
