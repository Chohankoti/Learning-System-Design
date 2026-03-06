import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<NotificationObserver> observers = new ArrayList<>();

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Order order) {

        for (NotificationObserver observer : observers) {
            observer.update(order);
        }
    }

    public void placeOrder(Order order) {

        System.out.println("Order placed: " + order.getOrderId());

        notifyObservers(order);
    }

}