public interface RideState {

    void assignDriver(Ride ride);

    void driverArrived(Ride ride);

    void startRide(Ride ride);

    void completeRide(Ride ride);

    void cancelRide(Ride ride);

}