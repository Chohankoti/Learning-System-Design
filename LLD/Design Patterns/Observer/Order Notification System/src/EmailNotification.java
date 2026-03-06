public class EmailNotification implements NotificationObserver {

    @Override
    public void update(Order order) {
        System.out.println(
                "Email sent to " + order.getUserEmail() + " with invoice for order " + order.getOrderId()
        );
    }

}