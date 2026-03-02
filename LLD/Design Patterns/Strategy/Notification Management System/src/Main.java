public class Main {

    public static void main(String[] args) {

        NotificationStrategy email = new EmailNotification();
        NotificationService service = new NotificationService(email);

        service.sendNotification("user@example.com", "Welcome!");

        // Change behavior at runtime
        service.setNotificationStrategy(new SMSNotification());
        service.sendNotification("9876543210", "Your OTP is 1234");
    }
}