import java.util.HashMap;
import java.util.Map;

public class Bank<T extends AbstractAccount> implements BankOperations {
    private Map<String, T> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(T account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account added for customer: " + account.getCustomer().getName());
    }

    public T getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    @Override
    public void deposit(String accountNumber, float amount) {
        T account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    @Override
    public void withdraw(String accountNumber, float amount) {
        T account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    @Override
    public void checkBalance(String accountNumber) {
        T account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

