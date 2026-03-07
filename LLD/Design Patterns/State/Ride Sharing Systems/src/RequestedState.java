public class RequestedState implements RideState {

    @Override
    public void assignDriver(Ride ride) {
        System.out.println("Driver assigned to ride.");
        ride.setState(new DriverAssignedState());
    }

    @Override
    public void driverArrived(Ride ride) {
        System.out.println("Driver not assigned yet.");
    }

    @Override
    public void startRide(Ride ride) {
        System.out.println("Cannot start ride before driver assignment.");
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