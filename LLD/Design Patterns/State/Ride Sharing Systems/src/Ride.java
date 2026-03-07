public class Ride {

    private RideState currentState;

    public Ride() {
        currentState = new RequestedState();
    }

    public void setState(RideState state) {
        this.currentState = state;
    }

    public void assignDriver() {
        currentState.assignDriver(this);
    }

    public void driverArrived() {
        currentState.driverArrived(this);
    }

    public void startRide() {
        currentState.startRide(this);
    }

    public void completeRide() {
        currentState.completeRide(this);
    }

    public void cancelRide() {
        currentState.cancelRide(this);
    }
}