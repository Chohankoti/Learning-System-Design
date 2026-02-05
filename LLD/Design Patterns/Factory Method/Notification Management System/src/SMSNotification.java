public class SMSNotification implements Notification{

    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS Notification Message was: "+msg);
    }
}
