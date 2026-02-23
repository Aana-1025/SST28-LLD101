import java.util.ArrayList;
import java.util.List;

public class AuditLog {

    private final List<String> logs = new ArrayList<>();

    public void add(String message) {
        logs.add(message);
    }

    public void print() {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}