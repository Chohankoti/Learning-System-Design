//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new WhatsAppNotificationFactory();
        NotificationService notificationService = new NotificationService(notificationFactory);

        notificationService.sendNotification("Hello Koti");
    }
}