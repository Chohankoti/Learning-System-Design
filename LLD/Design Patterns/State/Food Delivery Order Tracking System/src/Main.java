public class Main {
    public static void main(String[] args) {

        Order order = new Order();

//        order.placed();
//        order.preparing();
//        order.outForDelivery();
//        order.delivered();


        order.placed();
        order.cancelOrder();
        order.preparing();
        order.outForDelivery();
        order.delivered();

    }
}