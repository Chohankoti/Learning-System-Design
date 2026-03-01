package Subsystems.Delivery_Service;

public class DeliveryServiceImpl implements DeliveryService {

    @Override
    public void assignDelivery(String userId, String restaurantId) {
        System.out.println("Assigning delivery for user " + userId);
    }
}
