public class PaymentService {

    private final PaymentFactory paymentFactory;

    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public void processPayment(double amount) {
        Payment payment = paymentFactory.createPayment();
        payment.pay(amount);
    }
}
