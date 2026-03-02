public class SMSNotification implements NotificationStrategy {

    @Override
    public void send(String to, String message) {
        System.out.println("Sending SMS to " + to);
        System.out.println("Message: " + message);
        // SMS gateway logic here
    }
}