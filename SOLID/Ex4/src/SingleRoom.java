public class SingleRoom implements RoomPricingStrategy {

    @Override
    public Money monthlyFee() {
        return new Money(4000);
    }

    @Override
    public Money deposit() {
        return new Money(2000);
    }
}