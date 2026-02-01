interface PaymentGateway {
    void pay();
}

class StripePayment implements PaymentGateway {
    public void pay() {
        // stripe payment logic
    }
}

class RazorpayPayment implements PaymentGateway {
    public void pay() {
        // razorpay payment logic
    }
}

class OrderService {
    private PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void placeOrder() {
        paymentGateway.pay();
    }
}