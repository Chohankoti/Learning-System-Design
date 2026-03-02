public class NotificationService {

    private NotificationStrategy notificationStrategy;

    public NotificationService(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void sendNotification(String to, String message) {
        notificationStrategy.send(to, message);
    }
}