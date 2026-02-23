public class DisciplinaryRule implements EligibilityRule {

    @Override
    public void validate(StudentProfile student, EligibilityEngineResult result) {
        if (student.disciplinaryFlag != 0) {
            result.addReason("Disciplinary flag present");
        }
    }
}