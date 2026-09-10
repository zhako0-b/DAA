package builder.phone;

public class PhoneObjectBuilder implements PhoneBuilder {
    private static final String def_color = "Black";
    private static final int def_camMP = 14;
    private static final int def_batteryMah = 4500;


    private String model;
    private String color = def_color;
    private int cameraMP = def_camMP;
    private int storage;
    private int batteryMah = def_batteryMah;

    @Override
    public PhoneObjectBuilder setModel(String model) {
        this.model = model;
        return this;
    }


    @Override
    public PhoneObjectBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public PhoneObjectBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public PhoneObjectBuilder setCamera(int cameraMp) {
        this.cameraMP = cameraMp;
        return this;
    }

    @Override
    public PhoneObjectBuilder setBattery(int batteryMah) {
        this.batteryMah = batteryMah;
        return this;
    }


}
