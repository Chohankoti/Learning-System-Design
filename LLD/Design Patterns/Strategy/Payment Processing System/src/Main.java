public class Main {
    public static void main(String[] args) {

        Payment payment = new UPIPayment();
        PaymentService paymentService = new PaymentService(payment);

        paymentService.pay(12.34);

        paymentService.setPaymentStrategy(new CreditCardPayment());

        paymentService.pay(10000.343);
    }
}