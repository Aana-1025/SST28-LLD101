public interface EligibilityRule {
    void validate(StudentProfile student, EligibilityEngineResult result);
}