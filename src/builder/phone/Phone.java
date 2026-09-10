package builder.phone;
public class Phone {
    private final String model;
    private final String color;
    private final int storage;
    private final int cameraMp;
    private final int batteryMah;


    Phone(String model, String color, int cameraMp, int storage, int batteryMah){
        this.batteryMah=batteryMah;
        this.model=model;
        this.color=color;
        this.cameraMp=cameraMp;
        this.storage=storage;
    }

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }public int getCameraMp(){
        return cameraMp;
    }public int getBatteryMah(){
        return batteryMah;
    }public int getStorage(){
        return storage;
    }


}
