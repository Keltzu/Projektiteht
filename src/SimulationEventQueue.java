import java.util.PriorityQueue;

public class SimulationEventQueue {
    private PriorityQueue<ArrivalEvent> events;

    public SimulationEventQueue() {
        events = new PriorityQueue<>((event1, event2) -> Long.compare(event1.getTime(), event2.getTime()));
    }

    public void addEvent(ArrivalEvent event) {
        events.add(event);
    }

    public void printEvents() {
        for (ArrivalEvent event : events) {
            System.out.println(event);
        }
    }
}
