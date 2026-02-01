class StripePayment {
    public void pay() {
        // stripe logic
    }
}

class RazorpayPayment {
    public void pay() {
        // razorpay logic
    }
}

class OrderService {

    public void placeOrder(String paymentType) {
        if (paymentType.equals("STRIPE")) {
            StripePayment stripe = new StripePayment();
            stripe.pay();
        } else if (paymentType.equals("RAZORPAY")) {
            RazorpayPayment razorpay = new RazorpayPayment();
            razorpay.pay();
        }
    }
}
