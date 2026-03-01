import Subsystems.Delivery_Service.DeliveryService;
import Subsystems.Notification_Service.NotificationService;
import Subsystems.Payment_Service.PaymentService;
import Subsystems.Restaurant_Service.RestaurantService;

public class OrderFacade {

    private final RestaurantService restaurantService;
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;
    private final NotificationService notificationService;

    public OrderFacade(RestaurantService restaurantService,
                       PaymentService paymentService,
                       DeliveryService deliveryService,
                       NotificationService notificationService) {

        this.restaurantService = restaurantService;
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void placeOrder(OrderRequest request) {

        if (!restaurantService.validateRestaurant(request.getRestaurantId())) {
            throw new RuntimeException("Invalid restaurant");
        }

        if (!paymentService.processPayment(request.getUserId(), request.getAmount())) {
            throw new RuntimeException("Payment failed");
        }

        deliveryService.assignDelivery(
                request.getUserId(),
                request.getRestaurantId()
        );

        notificationService.sendNotification(
                request.getUserId(),
                "Your order has been placed successfully!"
        );

        System.out.println("Order placed successfully!");
    }
}