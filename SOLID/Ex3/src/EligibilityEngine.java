import java.util.*;

public class EligibilityEngine {

    private final FakeEligibilityStore store;
    private final List<EligibilityRule> rules;

    public EligibilityEngine(FakeEligibilityStore store, List<EligibilityRule> rules) {
        this.store = store;
        this.rules = rules;
    }

    public void runAndPrint(StudentProfile s) {
        ReportPrinter p = new ReportPrinter();
        EligibilityEngineResult r = evaluate(s);
        p.print(s, r);
        store.save(s.rollNo, r.getStatus());
    }

    public EligibilityEngineResult evaluate(StudentProfile s) {

        EligibilityEngineResult result = new EligibilityEngineResult();

        for (EligibilityRule rule : rules) {
            rule.validate(s, result);
        }

        if (result.getReasons().isEmpty()) {
            result.setStatus("ELIGIBLE");
        } else {
            result.setStatus("NOT_ELIGIBLE");
        }

        return result;
    }
}