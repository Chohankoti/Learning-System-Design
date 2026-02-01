interface PaymentMethod {
    void pay();
}

class CardPayment implements PaymentMethod {
    public void pay() {
        // card payment
    }
}

class UpiPayment implements PaymentMethod {
    public void pay() {
        // upi payment
    }
}

class PaymentService {
    public void process(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}
