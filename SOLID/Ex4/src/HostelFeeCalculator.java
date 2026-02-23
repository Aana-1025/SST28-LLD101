
public class HostelFeeCalculator {

    private final FakeBookingRepo repo;

    public HostelFeeCalculator(FakeBookingRepo repo) {
        this.repo = repo;
    }

    public void process(BookingRequest req) {

        // Get correct pricing strategy
        RoomPricingStrategy strategy =
                RoomFactory.create(req.getRoomType());

        Money monthly = strategy.monthlyFee();
        Money deposit = strategy.deposit();

        // Add addon costs
        for (AddOn addOn : req.getAddOns()) {
            monthly = monthly.plus(addOn.monthlyCost());
        }

        // ✅ FIX: Use instance printer (NOT static)
        ReceiptPrinter printer = new ReceiptPrinter();
        printer.print(req, monthly, deposit);

        // ✅ FIX: Match repo method signature
        repo.save(
                req.getRoomType().name(),  // id
                req,
                monthly,
                deposit
        );
    }
}