//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Notification notification = new SMSAdapter(new SMS());

        NotificationService notificationService = new NotificationService(notification);

        notificationService.processNotification("Hello Chohan Koti");
    }
}