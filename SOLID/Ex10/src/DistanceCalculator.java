public class DistanceCalculator implements DistanceService {

    @Override
    public double km(GeoPoint from, GeoPoint to) {
        // simple deterministic fake distance
        return 6.0;
    }
}