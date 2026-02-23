public class DeluxeRoom implements RoomPricingStrategy {

    @Override
    public Money monthlyFee() {
        return new Money(6000);
    }

    @Override
    public Money deposit() {
        return new Money(3000);
    }
}