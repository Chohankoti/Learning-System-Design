public class Placed implements OrderState{
    @Override
    public void placed(Order order) {
        System.out.println("Order was already placed");
    }

    @Override
    public void preparing(Order order) {
        System.out.println("Order is preparing");
        order.setState(new Preparing());
    }

    @Override
    public void outForDelivery(Order order) {
        System.out.println("Order still not prepared yet");
    }

    @Override
    public void delivered(Order order) {
        System.out.println("Order still not prepared yet");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled, your 100% amount will refund in short time");
        order.setState(new CancelOrder());
    }
}
