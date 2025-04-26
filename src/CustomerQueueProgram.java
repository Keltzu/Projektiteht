import java.util.LinkedList;
import java.util.Scanner;

public class CustomerQueueProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Customer> queue = new LinkedList<>();
        boolean running = true;

        System.out.println("Tervetuloa asiakasjonosimulaatioon!");

        while (running) {
            System.out.println("\nValitse toiminto:");
            System.out.println("1 - Lisää asiakas jonoon");
            System.out.println("2 - Poista asiakas jonosta");
            System.out.println("3 - Lopeta");
            System.out.print("Valinta: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Customer newCustomer = new Customer();
                    newCustomer.setStartTime(System.nanoTime());
                    queue.addFirst(newCustomer);
                    System.out.println("Asiakas " + newCustomer.getId() + " lisätty jonoon.");
                    break;

                case "2":
                    if (!queue.isEmpty()) {
                        Customer removedCustomer = queue.removeLast();
                        removedCustomer.setEndTime(System.nanoTime());
                        long timeSpent = removedCustomer.timeSpent();
                        System.out.println("Asiakas " + removedCustomer.getId() + " poistui jonosta.");
                        System.out.println("Aika jonossa: " + timeSpent + " nanosekuntia.");
                    } else {
                        System.out.println("Jono on tyhjä, ei ketään poistettavana.");
                    }
                    break;

                case "3":
                    running = false;
                    System.out.println("Ohjelma lopetettu.");
                    break;

                default:
                    System.out.println("Virheellinen valinta, yritä uudelleen.");
            }
        }

        scanner.close();
    }
}
