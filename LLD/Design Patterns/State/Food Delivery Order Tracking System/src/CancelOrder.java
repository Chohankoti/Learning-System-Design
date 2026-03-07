public class CancelOrder implements OrderState{
    @Override
    public void placed(Order order) {
        System.out.println("Order already cancelled, your 100% amount will refund in short time");
    }

    @Override
    public void preparing(Order order) {
        System.out.println("Order already cancelled, your 40% amount will refund in short time");
    }

    @Override
    public void outForDelivery(Order order) {
        System.out.println("Order already cancelled, you won't get refund");
    }

    @Override
    public void delivered(Order order) {
        System.out.println("Sorry already order was delivered, we can't cancel order at this time");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order was already cancel");
    }
}
