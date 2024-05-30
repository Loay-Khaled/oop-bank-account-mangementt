public class SavingsAccount extends Account {
    private float interestRate;

    public SavingsAccount(String accountNumber, Customer customer, float interestRate) {
        super(accountNumber, customer, interestRate, interestRate);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * interestRate;
        System.out.println("Interest applied: " + (balance * interestRate));
    }

    @Override
    public void deposit(float amount) {
        super.deposit(amount);
        applyInterest();
    }

    @Override
    public void withdraw(float amount) {
        super.withdraw(amount);
        applyInterest();
    }
}
