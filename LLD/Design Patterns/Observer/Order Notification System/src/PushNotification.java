public class PushNotification implements NotificationObserver {

    @Override
    public void update(Order order) {
        System.out.println(
                "Push Notification: Order " + order.getOrderId() + " placed successfully."
        );
    }

}