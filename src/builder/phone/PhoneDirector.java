package builder.phone;

public class PhoneDirector {

    public void FlagshipPhone(PhoneBuilder builder) {
        builder.setModel("Phone X Pro")
                .setColor("Titanium")
                .setStorage(512)
                .setCamera(108)
                .setBattery(5000);
    }

    public void BudgetPhone(PhoneBuilder builder) {
        builder.setModel("Phone Lite")
                .setColor("Blue")
                .setStorage(64)
                .setCamera(13)
                .setBattery(4500);
    }
}
