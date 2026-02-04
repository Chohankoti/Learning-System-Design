public class WalletPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new WalletPayment();
    }
}
