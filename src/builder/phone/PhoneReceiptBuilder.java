package builder.phone;


public class PhoneReceiptBuilder implements PhoneBuilder {

    private static final String HEADER = "=== Order Confirmation ===\n";
    private static final String NO_MODEL_SET = "Not selected";

    private final StringBuilder sb = new StringBuilder(HEADER);
    private boolean modelSet = false;

    @Override
    public PhoneReceiptBuilder setModel(String model) {
        sb.append("Model:   ").append(model).append("\n");
        modelSet = true;
        return this;
    }

    @Override
    public PhoneReceiptBuilder setColor(String color) {
        sb.append("Color:   ").append(color).append("\n");
        return this;
    }

    @Override
    public PhoneReceiptBuilder setStorage(int storageGb) {
        sb.append("Storage: ").append(storageGb).append("GB\n");
        return this;
    }

    @Override
    public PhoneReceiptBuilder setCamera(int cameraMp) {
        sb.append("Camera:  ").append(cameraMp).append("MP\n");
        return this;
    }

    @Override
    public PhoneReceiptBuilder setBattery(int batteryMah) {
        sb.append("Battery: ").append(batteryMah).append("mAh\n");
        return this;
    }


    public String getResult() {
        if (!modelSet) {
            throw new IllegalStateException("Cannot print a receipt: " + NO_MODEL_SET + " model");
        }
        return sb.toString();
    }
}