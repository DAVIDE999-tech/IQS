import java.util.Objects;

/**
 * Generico conto corrente
 * Consente di prelevare e depositare denaro
 */

public abstract class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public abstract void monthEnd();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        BankAccount that = (BankAccount) o;
        return Double.compare(this.balance, that.balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(balance);
    }
}
