public class WhatsAppNotification implements Notification{
    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp Notification Message was: "+msg);
    }
}
