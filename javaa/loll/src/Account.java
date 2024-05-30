public class Account extends AbstractAccount {
    private float overdraftLimit;
    private float interestRate;

    public Account(String accountNumber, Customer customer, float overdraftLimit, float interestRate) {
        super(accountNumber, customer);
        this.overdraftLimit = overdraftLimit;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (amount > 0) {
            if (amount <= balance + overdraftLimit) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                float overdraftAmount = amount - (balance + overdraftLimit);
                System.out.println("Invalid or insufficient funds. Overdraft: " + overdraftAmount);
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void applyInterest() {
        float interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }

    public float getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
}
