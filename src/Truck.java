
public class Truck extends TransportationVehicle {
    private final double tonnage;

    public Truck(double tonnage){
        this.tonnage = tonnage;
    }

    public double getTonnage(){
        return tonnage;
    }
}