public class DriverArrivingState implements RideState {

    @Override
    public void assignDriver(Ride ride) {
        System.out.println("Driver already assigned.");
    }

    @Override
    public void driverArrived(Ride ride) {
        System.out.println("Driver already arrived.");
    }

    @Override
    public void startRide(Ride ride) {
        System.out.println("Ride started.");
        ride.setState(new RideStartedState());
    }

    @Override
    public void completeRide(Ride ride) {
        System.out.println("Ride hasn't started yet.");
    }

    @Override
    public void cancelRide(Ride ride) {
        System.out.println("Ride cancelled.");
        ride.setState(new CancelledState());
    }

}