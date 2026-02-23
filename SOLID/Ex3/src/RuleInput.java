public class RuleInput {

    private final double minCgr;
    private final int minAttendance;
    private final int minCredits;

    public RuleInput(double minCgr, int minAttendance, int minCredits) {
        this.minCgr = minCgr;
        this.minAttendance = minAttendance;
        this.minCredits = minCredits;
    }

    public double getMinCgr() {
        return minCgr;
    }

    public int getMinAttendance() {
        return minAttendance;
    }

    public int getMinCredits() {
        return minCredits;
    }
}