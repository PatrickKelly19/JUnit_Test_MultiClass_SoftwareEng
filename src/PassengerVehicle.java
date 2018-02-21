public class PassengerVehicle extends Vehicle {
    private int noOfPassengers;
    private int seats;

    public PassengerVehicle(){
    }

    public PassengerVehicle(int noOfPassengers, int seats){
        this.noOfPassengers = noOfPassengers;
        this.seats = seats;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }
    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
}