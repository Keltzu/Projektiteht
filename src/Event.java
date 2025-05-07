public class Event implements Comparable<Event> {
    private double time;
    private String name;
    private EventType type;

    public Event(double time, String name, EventType type) {
        this.time = time;
        this.name = name;
        this.type = type;
    }

    public double getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public EventType getType() {
        return type;
    }

    @Override
    public int compareTo(Event other) {
        return Double.compare(this.time, other.time);
    }

    @Override
    public String toString() {
        return "Event{" +
                "time=" + time +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
