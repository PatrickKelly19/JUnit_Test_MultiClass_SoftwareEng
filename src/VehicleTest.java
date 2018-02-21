
import org.junit.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertSame;

public class VehicleTest {

    Vehicle v;
    TransportationVehicle tv;
    PassengerVehicle pv;

    @Before
    // Will be performed before each test
    public void TestSetup() {
        System.out.println("Setup for test complete.");
    }

    @After
    // Will be performed after each test
    public void TestComplete() {
        System.out.println("Test complete.");
    }

    @Test
    public void TestYear() {
        Vehicle v = new Vehicle();
        System.out.println("Year: "+v.getYear());
        v.setYear(1990);
        System.out.println("Year: "+v.getYear());
        assertEquals(1990,v.getYear());
        System.out.println("Year: "+v.getYear());
        System.out.println("Year!!!!: "+v.getYear());
    }

    @Test
    public void TestSpeed() {
        Vehicle v = new Vehicle();
        //assertEquals(0,v.getSpeed());
        v.setSpeed(210);
        assertEquals(210,v.getSpeed());
        System.out.println("Top Speed: "+v.getSpeed());
    }

    @Test
    public void TestWheels() {
        Vehicle v = new Vehicle();
        assertEquals(0,v.getWheels());
        v.setWheels(4);
        assertEquals(4,v.getWheels());
        System.out.println("Number of Wheels: "+v.getWheels());
    }

    @Test
    public void TestDoors() {
        Vehicle v = new Vehicle();
        assertEquals(0,v.getDoors());
        v.setDoors(5);
        assertEquals(5,v.getDoors());
        System.out.println("Number of Doors: "+v.getDoors());
    }

    @Test
    public void TestPrice() {
        Vehicle v = new Vehicle();
        assertEquals(0.0,v.getprice());
        v.setPrice(20020.56);
        assertEquals(20020.56,v.getprice());
        System.out.println("Price of Car: "+v.getprice());
    }

    @Test
    public void TestKm() {
        Vehicle v = new Vehicle();
        assertEquals(0.0,v.getKm());
        v.setKm(505.49);
        assertEquals(505.49,v.getKm());
        System.out.println("Total Km: "+v.getKm());
    }

    @Test
    public void TestMake() {
        Vehicle v = new Vehicle();
        v.setMake("Volvo");
        assertEquals("Volvo",v.getMake());
        System.out.println("Make: "+v.getMake());
    }

    @Test
    public void TestRegNo() {
        Vehicle v = new Vehicle();
        v.setRegNo("162-D-12345");
        assertEquals("162-D-12345",v.getRegNo());
        System.out.println("RegNo: "+v.getRegNo());
    }

    @Test
    public void TestColour() {
        Vehicle v = new Vehicle();
        v.setColour("Blue");
        assertEquals("Blue",v.getColour());
        System.out.println("Colour: "+v.getColour());
    }

    @Test
    public void TestFuelType() {
        Vehicle v = new Vehicle();
        v.setFuelType("Petrol");
        assertEquals("Petrol",v.getFuelType());
        System.out.println("Fuel Type: "+v.getFuelType());
    }

    @Test
    public void TestGearBox() {
        Vehicle v = new Vehicle();
        v.setGearbox("Manual");
        assertEquals("Manual",v.getGearbox());
        System.out.println("Gearbox: "+v.getGearbox());
    }

    @Test
    public void TestLoadCapacity() {
        TransportationVehicle tv = new TransportationVehicle();
        tv.setLoadCapacity("200kg - standard");
        assertEquals("200kg - standard",tv.getLoadCapacity());
        System.out.println("Load Capacity: "+tv.getLoadCapacity());
    }

    @Test
    public void TestGoods() {
        TransportationVehicle tv = new TransportationVehicle();
        tv.setGoods("Fruit");
        assertEquals("Fruit",tv.getGoods());
        System.out.println("Goods Transported: "+tv.getGoods());
    }

    @Test
    public void TestPassengers() {
        PassengerVehicle pv = new PassengerVehicle();
        pv.setNoOfPassengers(1);
        assertEquals(1,pv.getNoOfPassengers());
        System.out.println("Number of Passengers: "+pv.getNoOfPassengers());
    }

    @Test
    public void TestSeats() {
        PassengerVehicle pv = new PassengerVehicle();
        pv.setSeats(1);
        assertEquals(1,pv.getSeats());
        System.out.println("Number of Seats: "+pv.getSeats());
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("VehicleTest");
    }
}

