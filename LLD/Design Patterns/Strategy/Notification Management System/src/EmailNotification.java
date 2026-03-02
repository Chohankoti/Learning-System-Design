public class EmailNotification implements NotificationStrategy {

    @Override
    public void send(String to, String message) {
        System.out.println("Sending EMAIL to " + to);
        System.out.println("Message: " + message);
        // Email sending logic here
    }
}