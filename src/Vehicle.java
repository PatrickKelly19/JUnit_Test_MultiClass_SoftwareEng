
public class Vehicle
{
    private int year, topSpeed, noOfWheels, noOfDoors;
    private double price, km;
    private String make, regNo, colour, fuelType, gearbox;

    public Vehicle() {
    }

    public Vehicle(int year, int topSpeed, int noOfWheels, int noOfDoors, double price, double km, String make, String regNo, String colour, String fuelType, String gearbox)
    {
        this.year = year;
        this.topSpeed = topSpeed;
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.price = price;
        this.km = km;
        this.make = make;
        this.regNo = regNo;
        this.colour = colour;
        this.fuelType = fuelType;
        this.gearbox = gearbox;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return topSpeed;
    }
    public void setSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getWheels() {
        return noOfWheels;
    }
    public void setWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getDoors() {
        return noOfDoors;
    }
    public void setDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public double getprice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getKm() {
        return km;
    }
    public void setKm(double km) {
        this.km = km;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getGearbox() {
        return gearbox;
    }
    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public String toString(){
        return getClass().getName() + "\n" + year;
    }
}