public class TransportationVehicle extends Vehicle {
    private String loadCapacity;
    private String goods;

    public TransportationVehicle(){
    }

    public TransportationVehicle(String loadCapacity, String goods){
        this.loadCapacity = loadCapacity;
        this.goods = goods;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getGoods() {
        return goods;
    }
    public void setGoods(String goods) {
        this.goods = goods;
    }
}