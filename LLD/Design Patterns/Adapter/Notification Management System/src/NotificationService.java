public class NotificationService {
    private final Notification notification;

    NotificationService(Notification notification){
        this.notification = notification;
    }

    void processNotification(String message){
        notification.sendNotification(message);
    }

}
