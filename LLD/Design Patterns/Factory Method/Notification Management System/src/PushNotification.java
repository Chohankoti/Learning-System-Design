public class PushNotification implements Notification{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Push Notification Message was: "+msg);
    }
}
