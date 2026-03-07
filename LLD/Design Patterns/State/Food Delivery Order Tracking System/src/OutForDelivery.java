public class OutForDelivery implements OrderState{
    @Override
    public void placed(Order order) {
        System.out.println("Order was already placed");
    }

    @Override
    public void preparing(Order order) {
        System.out.println("Order was already prepared");

    }

    @Override
    public void outForDelivery(Order order) {
        System.out.println("Order was already out for delivery");
    }

    @Override
    public void delivered(Order order) {
        System.out.println("Order delivered successfully");
        order.setState(new Delivered());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled, you won't get refund");
        order.setState(new CancelOrder());
    }
}
