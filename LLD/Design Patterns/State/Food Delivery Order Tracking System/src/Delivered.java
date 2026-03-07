public class Delivered implements OrderState{
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
        System.out.println("Order was already delivered");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Sorry order was delivered, we can't cancel order at this time");
    }
}
