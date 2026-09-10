package builder.phone;

public interface PhoneBuilder {
    PhoneBuilder setModel(String model);
    PhoneBuilder setColor(String color);
    PhoneBuilder setStorage(int storage);
    PhoneBuilder setCamera(int cameraMp);
    PhoneBuilder setBattery(int batteryMah);
}
