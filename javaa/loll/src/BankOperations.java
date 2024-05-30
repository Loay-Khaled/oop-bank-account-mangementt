public interface BankOperations {
    void deposit(String accountNumber, float amount);
    void withdraw(String accountNumber, float amount);
    void checkBalance(String accountNumber);
}
