public class Main {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.addObserver(new PushNotification());
        orderService.addObserver(new EmailNotification());
        orderService.addObserver(new SMSNotification());

        Order order = new Order(
                "ORD123",
                "user@gmail.com",
                "9876543210"
        );

        orderService.placeOrder(order);

    }
}