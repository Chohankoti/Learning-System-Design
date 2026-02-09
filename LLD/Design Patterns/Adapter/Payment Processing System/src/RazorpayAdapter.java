public class RazorpayAdapter implements PaymentGateway {

    private final RazorpaySDK razorpaySDK;

    public RazorpayAdapter(RazorpaySDK razorpaySDK) {
        this.razorpaySDK = razorpaySDK;
    }

    @Override
    public void pay(double amount) {
        razorpaySDK.makePayment(amount);
    }
}
