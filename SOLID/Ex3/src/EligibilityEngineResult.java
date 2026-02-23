import java.util.*;

public class EligibilityEngineResult {

    private String status;
    private final List<String> reasons = new ArrayList<>();

    public void addReason(String reason) {
        reasons.add(reason);
    }

    public List<String> getReasons() {
        return reasons;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}