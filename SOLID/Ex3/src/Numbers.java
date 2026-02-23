public final class Numbers {

    private Numbers() {}

    public static double clamp(double x, double a, double b) {
        return Math.max(a, Math.min(b, x));
    }
}