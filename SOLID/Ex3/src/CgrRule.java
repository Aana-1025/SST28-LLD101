public class CgrRule implements EligibilityRule {

    private final double minCgr;

    public CgrRule(double minCgr) {
        this.minCgr = minCgr;
    }

    @Override
    public void validate(StudentProfile student, EligibilityEngineResult result) {
        if (student.cgr < minCgr) {
            result.addReason("CGR below minimum");
        }
    }
}