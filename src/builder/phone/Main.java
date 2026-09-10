package builder.phone;


public class Main {
    public static void main(String[] args) {
        PhoneDirector director = new PhoneDirector();


        PhoneObjectBuilder objectBuilder = new PhoneObjectBuilder();
        director.FlagshipPhone(objectBuilder);
        Phone flagship = objectBuilder.getResult();
        System.out.println(flagship);


        PhoneReceiptBuilder receiptBuilder = new PhoneReceiptBuilder();
        director.FlagshipPhone(receiptBuilder);
        String receipt = receiptBuilder.getResult();
        System.out.println(receipt);


        PhoneObjectBuilder budgetObjectBuilder = new PhoneObjectBuilder();
        director.BudgetPhone(budgetObjectBuilder);
        System.out.println(budgetObjectBuilder.getResult());
    }
}
