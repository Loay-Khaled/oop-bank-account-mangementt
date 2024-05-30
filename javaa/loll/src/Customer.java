public class Customer implements CustomerDetails {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCustomerId() {
        return customerId;
    }
}
