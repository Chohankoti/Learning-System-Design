public class RideStartedState implements RideState {

    @Override
    public void assignDriver(Ride ride) {
        System.out.println("Driver already assigned.");
    }

    @Override
    public void driverArrived(Ride ride) {
        System.out.println("Ride already started.");
    }

    @Override
    public void startRide(Ride ride) {
        System.out.println("Ride already in progress.");
    }

    @Override
    public void completeRide(Ride ride) {
        System.out.println("Ride completed.");
        ride.setState(new RideCompletedState());
    }

    @Override
    public void cancelRide(Ride ride) {
        System.out.println("Cannot cancel ride after it has started.");
    }

}