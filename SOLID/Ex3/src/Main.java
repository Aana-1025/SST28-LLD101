import java.util.*;

public class Main {

    public static void main(String[] args) {

        FakeEligibilityStore store = new FakeEligibilityStore();

        List<EligibilityRule> rules = List.of(
                new DisciplinaryRule(),
                new CgrRule(8.0),          // pass minimum CGR
                new AttendanceRule(75),    // pass minimum attendance
                new CreditsRule(20)        // pass minimum credits
        );

        EligibilityEngine engine =
                new EligibilityEngine(store, rules);

        StudentProfile s = new StudentProfile(
                "S101",
                "Riya",
                8.5,
                82,
                24,
                LegacyFlags.NONE
        );

        engine.runAndPrint(s);
    }
}