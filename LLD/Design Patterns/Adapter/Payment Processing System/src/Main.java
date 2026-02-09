public class Main {
    public static void main(String[] args) {

        // Choose gateway dynamically
        PaymentGateway gateway =
                new RazorpayAdapter(new RazorpaySDK());

        PaymentService service = new PaymentService(gateway);
        service.processPayment(500.0);
    }
}
