public class ReceiptPrinter {

    public void print(BookingRequest req, Money monthly, Money deposit) {

        System.out.println("Room: " + req.getRoomType());
        System.out.println("AddOns: " + req.getAddOns());
        System.out.println("Monthly: " + monthly);
        System.out.println("Deposit: " + deposit);
        System.out.println("TOTAL DUE NOW: " + monthly.plus(deposit));
    }
}