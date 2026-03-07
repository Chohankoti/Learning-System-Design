public class CancelledState implements RideState {

    @Override
    public void assignDriver(Ride ride) {
        System.out.println("Ride cancelled.");
    }

    @Override
    public void driverArrived(Ride ride) {
        System.out.println("Ride cancelled.");
    }

    @Override
    public void startRide(Ride ride) {
        System.out.println("Ride cancelled.");
    }

    @Override
    public void completeRide(Ride ride) {
        System.out.println("Ride cancelled.");
    }

    @Override
    public void cancelRide(Ride ride) {
        System.out.println("Ride already cancelled.");
    }

}