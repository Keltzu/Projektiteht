public class SimulatorClock {
    private static SimulatorClock instance;
    private long time;

    private SimulatorClock() {
        this.time = 0; // Initial time set to 0
    }

    public static SimulatorClock getInstance() {
        if (instance == null) {
            instance = new SimulatorClock();
        }
        return instance;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }
}
