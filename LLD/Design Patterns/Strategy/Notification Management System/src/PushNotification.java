public class PushNotification implements NotificationStrategy {

    @Override
    public void send(String to, String message) {
        System.out.println("Sending PUSH notification to " + to);
        System.out.println("Message: " + message);
        // Push service logic here
    }
}