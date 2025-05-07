import java.util.Random;

public class ArrivalEventGenerator {
    private Random randomGenerator;
    private String eventType;

    public ArrivalEventGenerator(String eventType, Random randomGenerator) {
        this.eventType = eventType;
        this.randomGenerator = randomGenerator;
    }

    public void generateArrival(SimulationEventQueue eventQueue) {
        // Generate a random arrival interval (for simplicity, let's assume it's uniformly distributed)
        long arrivalInterval = randomGenerator.nextInt(10) + 1;  // Random time interval between 1 and 10 units

        // Get the current time from the SimulatorClock
        long currentTime = SimulatorClock.getInstance().getTime();

        // Calculate the time of the next arrival
        long nextArrivalTime = currentTime + arrivalInterval;

        // Create a new event and add it to the event queue
        ArrivalEvent newEvent = new ArrivalEvent(nextArrivalTime, eventType);
        eventQueue.addEvent(newEvent);

        // Move the clock forward
        SimulatorClock.getInstance().setTime(nextArrivalTime);
    }
}
