public class Main {
    public static void main(String[] args) {

        // Inject a specific PaymentFactory implementation into the service
        PaymentFactory factory = new UPIPaymentFactory();

        // Service stores the factory reference for object creation
        PaymentService service = new PaymentService(factory);

        // Service uses the factory to create the Payment object
        // and invokes its payment behavior
        service.processPayment(500.0);
    }
}
