public class OrderRequestedState implements OrderState{
    @Override
    public void placed(Order order) {
        System.out.println("Order placed successfully");
        order.setState(new Placed());
    }

    @Override
    public void preparing(Order order) {
        System.out.println("Still order is not placed");
    }

    @Override
    public void outForDelivery(Order order) {
        System.out.println("Still order is not placed");
    }

    @Override
    public void delivered(Order order) {
        System.out.println("Still order is not placed");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Still order is not placed");
    }
}
