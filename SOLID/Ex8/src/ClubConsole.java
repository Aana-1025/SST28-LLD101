public class ClubConsole {

    private final MinutesManager secretary;
    private final FinanceManager treasurer;
    private final EventManager planner;

    public ClubConsole(BudgetLedger ledger,
                       MinutesBook minutes,
                       EventPlanner events) {

        this.secretary = new SecretaryTool(minutes);
        this.treasurer = new TreasurerTool(ledger);
        this.planner = events;
    }

    public void run() {

        secretary.addMinutes("Meeting started");

        treasurer.addIncome(5000, "Membership fees");
        treasurer.addExpense(1200, "Snacks");

        planner.createEvent("Tech Fest", 10000);

        System.out.println("Total events: " + planner.getEventsCount());
    }
}