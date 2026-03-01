package Subsystems.Payment_Service;

public interface PaymentService {
    boolean processPayment(String userId, double amount);
}