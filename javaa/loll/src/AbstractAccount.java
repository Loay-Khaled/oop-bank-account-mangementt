public abstract class AbstractAccount {
    protected String accountNumber;
    protected float balance;
    protected Customer customer;

    public AbstractAccount(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0f;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public abstract void deposit(float amount);
    public abstract void withdraw(float amount);
}
