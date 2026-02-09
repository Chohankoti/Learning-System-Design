public class PaypalAdapter implements PaymentGateway {

    private final PaypalSDK paypalSDK;

    public PaypalAdapter(PaypalSDK paypalSDK) {
        this.paypalSDK = paypalSDK;
    }

    @Override
    public void pay(double amount) {
        paypalSDK.sendMoney(amount);
    }
}
