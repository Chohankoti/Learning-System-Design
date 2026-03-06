import java.util.Random;

public class SMSNotification implements NotificationObserver {

    @Override
    public void update(Order order) {

        int otp = new Random().nextInt(9000) + 1000;

        System.out.println(
                "SMS sent to " + order.getPhoneNumber() +
                        " with delivery confirmation OTP: " + otp
        );
    }

}