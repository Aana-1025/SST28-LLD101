public interface RoomPricingStrategy {
    Money monthlyFee();
    Money deposit();
}