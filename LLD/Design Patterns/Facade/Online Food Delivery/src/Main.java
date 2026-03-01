import Subsystems.Delivery_Service.DeliveryService;
import Subsystems.Delivery_Service.DeliveryServiceImpl;
import Subsystems.Notification_Service.EmailNotificationService;
import Subsystems.Notification_Service.NotificationService;
import Subsystems.Payment_Service.CreditCardPaymentService;
import Subsystems.Payment_Service.PaymentService;
import Subsystems.Restaurant_Service.RestaurantService;
import Subsystems.Restaurant_Service.RestaurantServiceImpl;

public class Main {

    public static void main(String[] args) {

        RestaurantService restaurantService = new RestaurantServiceImpl();
        PaymentService paymentService = new CreditCardPaymentService();
        DeliveryService deliveryService = new DeliveryServiceImpl();
        NotificationService notificationService = new EmailNotificationService();

        OrderFacade orderFacade = new OrderFacade(
                restaurantService,
                paymentService,
                deliveryService,
                notificationService
        );

        OrderRequest request = new OrderRequest(
                "user123",
                "restaurant456",
                499.0
        );

        orderFacade.placeOrder(request);
    }
}