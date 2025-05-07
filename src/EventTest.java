public class EventTest {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        // Luo tapahtumia, joilla on eri tyypit
        eventList.addEvent(new Event(5.0, "Customer A", EventType.ARRIVAL));
        eventList.addEvent(new Event(2.5, "Customer B", EventType.ARRIVAL));
        eventList.addEvent(new Event(7.2, "Customer C", EventType.EXIT));
        eventList.addEvent(new Event(1.0, "Customer D", EventType.ARRIVAL));

        // Poista seuraava tapahtuma
        Event next = eventList.getNextEvent();
        System.out.println("Next event (removed): " + next);

        // Tulosta loput tapahtumat aikajärjestyksessä
        System.out.println("Remaining events in order:");
        for (Event e : eventList.getEventsInOrder()) {
            System.out.println(e);
        }
    }
}
