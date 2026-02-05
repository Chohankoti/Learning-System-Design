public class NotificationService {
    private final NotificationFactory notificationFactory;

    NotificationService(NotificationFactory notificationFactory){
        this.notificationFactory = notificationFactory;
    }

    void sendNotification(String msg){
        Notification notification = notificationFactory.createNotification();
        notification.sendMessage(msg);
    }
}
