
public class Bike extends PassengerVehicle {
    private final int rideHeight;

    public Bike(int rideHeight){
        this.rideHeight = rideHeight;
    }

    public double getRideHeight(){
        return rideHeight;
    }
}