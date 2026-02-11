public class WhatsAppAdapter implements Notification{

    private final WhatsApp whatsApp;

    WhatsAppAdapter(WhatsApp whatsApp){
        this.whatsApp = whatsApp;
    }

    @Override
    public void sendNotification(String message) {
        whatsApp.sendWhatsAppMessage(message);
    }
}
