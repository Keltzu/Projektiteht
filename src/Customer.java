// Tehtävä 1_3
// Asiakasluokka
public class Customer {
    private static int nextId = 1;  // Seuraavan asiakkaan id
    private int id;
    private long startTime;
    private long endTime;

    public Customer() {
        this.id = nextId;
        nextId++;
    }

    // Asetetaan aloitusaika
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    // Asetetaan lopetusaika
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // Haetaan asiakkaan id
    public int getId() {
        return id;
    }

    // Haetaan aloitusaika
    public long getStartTime() {
        return startTime;
    }

    // Haetaan lopetusaika
    public long getEndTime() {
        return endTime;
    }

    // Lasketaan käytetty aika
    public long timeSpent() {
        return endTime - startTime;
    }
}
