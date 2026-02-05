public class WhatsAppNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new WhatsAppNotification();
    }
}
