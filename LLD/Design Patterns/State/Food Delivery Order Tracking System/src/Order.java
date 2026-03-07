public class Order {

    private OrderState currentState;

    Order(){
        this.currentState = new OrderRequestedState();
    }

    public void setState(OrderState orderState){
        this.currentState = orderState;
    }

    public boolean isCancelled(){
        return currentState instanceof CancelOrder;
    }

    public void placed() {
        if(isCancelled()) return;
        currentState.placed(this);
    }

    public void preparing() {
        if(isCancelled()) return;
        currentState.preparing(this);
    }

    public void outForDelivery() {
        if(isCancelled()) return;
        currentState.outForDelivery(this);
    }

    public void delivered() {
        if(isCancelled()) return;
        currentState.delivered(this);
    }

    public void cancelOrder() {
        currentState.cancelOrder(this);
    }
}