public class CustomerGenerator {

    private ServicePoint servicePoint;

    public CustomerGenerator(ServicePoint servicePoint) {
        this.servicePoint = servicePoint;
    }

    // Luo tietyn määrän asiakkaita
    public void generateCustomers(int amount) {
        for (int i = 0; i < amount; i++) {
            Customer customer = new Customer();
            servicePoint.addToQueueue(customer);
        }
    }
}
