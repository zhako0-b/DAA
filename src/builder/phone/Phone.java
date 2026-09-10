package builder.phone;
public class Phone {
    private final String model;
    private final String color;
    private final int storage;
    private final int cameraMp;
    private final int batteryMah;


    Phone(String model, String color, int storage, int cameraMp, int batteryMah) {
        this.model = model;
        this.color = color;
        this.storage = storage;
        this.cameraMp = cameraMp;
        this.batteryMah = batteryMah;
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

    @Override
    public String toString() {
        return "Phone[" + model + ", " + color + ", " + storage + "GB, "
                + cameraMp + "MP camera, " + batteryMah + "mAh]";
    }
}
