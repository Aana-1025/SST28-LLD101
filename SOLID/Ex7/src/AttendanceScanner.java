public class AttendanceScanner implements AttendanceCapable {

    @Override
    public int scanAttendance() {
        int present = 3;
        System.out.println("Attendance scanned: present=" + present);
        return present;
    }
}