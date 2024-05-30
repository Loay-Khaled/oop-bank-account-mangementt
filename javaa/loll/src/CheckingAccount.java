public class CheckingAccount extends Account {
    private float overdraftLimit;

    public CheckingAccount(String accountNumber, Customer customer, float overdraftLimit) {
        super(accountNumber, customer, overdraftLimit, overdraftLimit);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
}
