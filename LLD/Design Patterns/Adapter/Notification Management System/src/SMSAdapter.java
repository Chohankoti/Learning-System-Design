public class SMSAdapter implements Notification {
    private final SMS sms;

    SMSAdapter(SMS sms){
        this.sms = sms;
    }

    @Override
    public void sendNotification(String message) {
        sms.sendSMSMessage(message);
    }
}
