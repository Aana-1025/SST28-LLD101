public class AttendanceRule implements EligibilityRule {

    private final int minAttendance;

    public AttendanceRule(int minAttendance) {
        this.minAttendance = minAttendance;
    }

    @Override
    public void validate(StudentProfile student, EligibilityEngineResult result) {
        if (student.attendancePct < minAttendance) {
            result.addReason("Attendance below minimum");
        }
    }
}