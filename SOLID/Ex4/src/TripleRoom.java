public class TripleRoom implements RoomPricingStrategy {

    @Override
    public Money monthlyFee() {
        return new Money(2500);
    }

    @Override
    public Money deposit() {
        return new Money(1200);
    }
}