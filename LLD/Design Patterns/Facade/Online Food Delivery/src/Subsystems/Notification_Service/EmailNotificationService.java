package Subsystems.Notification_Service;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("Sending email to " + userId + ": " + message);
    }
}
