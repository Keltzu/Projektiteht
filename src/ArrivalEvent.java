public class ArrivalEvent {
    private long time;
    private String type;

    public ArrivalEvent(long time, String type) {
        this.time = time;
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ArrivalEvent{" +
                "time=" + time +
                ", type='" + type + '\'' +
                '}';
    }
}
