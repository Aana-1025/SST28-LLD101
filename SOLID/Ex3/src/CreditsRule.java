public class CreditsRule implements EligibilityRule {

    private final int minCredits;

    public CreditsRule(int minCredits) {
        this.minCredits = minCredits;
    }

    @Override
    public void validate(StudentProfile student, EligibilityEngineResult result) {
        if (student.earnedCredits < minCredits) {
            result.addReason("Insufficient credits");
        }
    }
}