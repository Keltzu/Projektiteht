import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime = 0; // Yhteispalveluaika
    private int servedCustomers = 0;   // Palveltujen asiakkaiden määrä

    public void addToQueueue(Customer customer) {
        customer.setStartTime(System.nanoTime());
        queue.addFirst(customer);
    }

    public Customer removeFromQueueue() {
        if (!queue.isEmpty()) {
            return queue.removeLast();
        }
        return null;
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueueue();

            if (customer != null) {
                try {
                    // Simuloidaan palveluaika satunnaisesti (0–1000 ms)
                    long serviceTimeMs = (long) (Math.random() * 1000);
                    Thread.sleep(serviceTimeMs);

                    long serviceTimeNs = serviceTimeMs * 1_000_000; // muutetaan nanosekunteiksi
                    totalServiceTime += serviceTimeNs;
                    servedCustomers++;

                    customer.setEndTime(System.nanoTime());

                    long responseTime = customer.timeSpent(); // kokonaisaika (jonotus + palvelu)
                    System.out.println("Asiakas " + customer.getId() + " palveltu.");
                    System.out.println("  Vastausaika (jonotus + palvelu): " + responseTime + " nanosekuntia.");
                    System.out.println("  Palveluaika: " + serviceTimeNs + " nanosekuntia.\n");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            }
        }
    }
