import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EventList {
    private PriorityQueue<Event> queue;

    public EventList() {
        queue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        queue.add(event);
    }

    public Event getNextEvent() {
        return queue.poll();
    }

    public List<Event> getEventsInOrder() {
        List<Event> sorted = new ArrayList<>(queue);
        Collections.sort(sorted);
        return sorted;
    }
}
