package Subsystems.Payment_Service;

public class CreditCardPaymentService implements PaymentService {

    @Override
    public boolean processPayment(String userId, double amount) {
        System.out.println("Processing payment of ₹" + amount + " for user " + userId);
        return true;
    }
}
