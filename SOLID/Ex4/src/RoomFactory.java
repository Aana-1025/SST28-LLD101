public class RoomFactory {

    public static RoomPricingStrategy create(RoomType type) {
        return switch (type) {
            case SINGLE -> new SingleRoom();
            case DOUBLE -> new DoubleRoom();
            case TRIPLE -> new TripleRoom();
            case DELUXE -> new DeluxeRoom();
        };
    }
}