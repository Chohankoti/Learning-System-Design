public class DriverAssignedState implements RideState {

    @Override
    public void assignDriver(Ride ride) {
        System.out.println("Driver already assigned.");
    }

    @Override
    public void driverArrived(Ride ride) {
        System.out.println("Driver has arrived.");
        ride.setState(new DriverArrivingState());
    }

    @Override
    public void startRide(Ride ride) {
        System.out.println("Driver hasn't arrived yet.");
    }

    @Override
    public void completeRide(Ride ride) {
        System.out.println("Ride not started yet.");
    }

    @Override
    public void cancelRide(Ride ride) {
        System.out.println("Ride cancelled.");
        ride.setState(new CancelledState());
    }

}