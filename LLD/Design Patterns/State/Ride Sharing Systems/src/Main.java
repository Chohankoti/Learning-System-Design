public class Main {

    public static void main(String[] args) {

        Ride ride = new Ride();

//        ride.assignDriver();
//        ride.driverArrived();
//        ride.startRide();
//        ride.completeRide();

//        ride.assignDriver();
//        ride.startRide(); // In UI user click start ride before arriving
//        ride.driverArrived();
//        ride.startRide();
//        ride.completeRide();

//        ride.assignDriver();
//        ride.driverArrived();
//        ride.startRide();
//        ride.cancelRide(); // In UI user click cancel ride after start ride
//        ride.completeRide();

        ride.assignDriver();
        ride.cancelRide(); // In UI user click cancel ride before arriving driver
        ride.driverArrived();
        ride.startRide();
        ride.completeRide();
    }
}