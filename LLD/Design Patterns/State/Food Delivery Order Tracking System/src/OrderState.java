public interface OrderState {

    void placed(Order order);
    void preparing(Order order);
    void outForDelivery(Order order);
    void delivered(Order order);
    void cancelOrder(Order order);

}
