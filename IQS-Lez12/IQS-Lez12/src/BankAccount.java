public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Il saldo disponibile non è sufficiente per il prelievo.");
        }
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
