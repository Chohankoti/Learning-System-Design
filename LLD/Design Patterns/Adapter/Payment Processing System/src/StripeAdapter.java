public class StripeAdapter implements PaymentGateway {

    private final StripeSDK stripeSDK;

    public StripeAdapter(StripeSDK stripeSDK) {
        this.stripeSDK = stripeSDK;
    }

    @Override
    public void pay(double amount) {
        stripeSDK.chargeCard(amount);
    }
}
