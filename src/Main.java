public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { // Ajetaan simulaatio kolme kertaa
            System.out.println("\n--- Simulaatio " + (i + 1) + " ---");
            ServicePoint servicePoint = new ServicePoint();
            CustomerGenerator generator = new CustomerGenerator(servicePoint);

            generator.generateCustomers(5); // Luodaan 5 asiakasta
            servicePoint.serve();
        }
    }
}