public class RideCompletedState implements RideState {

    @Override
    public void assignDriver(Ride ride) {
        System.out.println("Ride already completed.");
    }

    @Override
    public void driverArrived(Ride ride) {
        System.out.println("Ride already completed.");
    }

    @Override
    public void startRide(Ride ride) {
        System.out.println("Ride already completed.");
    }

    @Override
    public void completeRide(Ride ride) {
        System.out.println("Ride already completed.");
    }

    @Override
    public void cancelRide(Ride ride) {
        System.out.println("Cannot cancel completed ride.");
    }

}