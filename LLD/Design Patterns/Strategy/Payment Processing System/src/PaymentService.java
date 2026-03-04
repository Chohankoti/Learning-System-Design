public class PaymentService {

    private Payment payment;

    PaymentService(Payment payment){
        this.payment = payment;
    }

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void pay(double amount){
        payment.pay(amount);
    }


}
