public class DoubleRoom implements RoomPricingStrategy {

    @Override
    public Money monthlyFee() {
        return new Money(3000);
    }

    @Override
    public Money deposit() {
        return new Money(1500);
    }
}