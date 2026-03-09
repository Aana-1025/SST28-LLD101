import java.util.*;

public class EventPlanner implements EventManager {

    private final List<String> events = new ArrayList<>();

    @Override
    public void createEvent(String name, double budget) {
        events.add(name);
        System.out.println("Event created: " + name + " (budget " + budget + ")");
    }

    @Override
    public int getEventsCount() {
        return events.size();
    }
}