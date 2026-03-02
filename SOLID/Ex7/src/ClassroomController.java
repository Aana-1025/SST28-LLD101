public class ClassroomController {

    private final DeviceRegistry registry;

    public ClassroomController(DeviceRegistry registry) {
        this.registry = registry;
    }

    public void startClass() {

        // Power on devices
        for (PowerControl p : registry.getByCapability(PowerControl.class)) {
            p.powerOn();
        }

        // Projector
        for (InputConnectable i : registry.getByCapability(InputConnectable.class)) {
            i.connectInput("HDMI-1");
        }

        // Lights
        for (BrightnessControl b : registry.getByCapability(BrightnessControl.class)) {
            b.setBrightness(60);
        }

        // AC
        for (TemperatureControl t : registry.getByCapability(TemperatureControl.class)) {
            t.setTemperatureC(24);
        }

        // Attendance
        for (AttendanceCapable a : registry.getByCapability(AttendanceCapable.class)) {
            a.scanAttendance();
        }
    }

    public void endClass() {

        System.out.println("Shutdown sequence:");

        for (PowerControl p : registry.getByCapability(PowerControl.class)) {
            p.powerOff();
        }
    }
}