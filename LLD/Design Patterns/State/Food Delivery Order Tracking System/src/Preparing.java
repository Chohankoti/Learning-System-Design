public class Preparing implements OrderState{
    @Override
    public void placed(Order order) {
        System.out.println("Order was already placed");
    }

    @Override
    public void preparing(Order order) {
        System.out.println("Order was already preparing");
    }

    @Override
    public void outForDelivery(Order order) {
        System.out.println("Order is out for delivery");
        order.setState(new OutForDelivery());
    }

    @Override
    public void delivered(Order order) {
        System.out.println("Order still not prepared yet");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled, your 40% amount will refund in short time");
        order.setState(new CancelOrder());
    }
}
