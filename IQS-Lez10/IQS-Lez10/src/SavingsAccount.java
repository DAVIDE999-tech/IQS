/**
 * Conto deposito pensato per incamerare gli interessi
 * Alla fine del mese corrente sono aggiunti gli interessi sul saldo minimo del mese
 * Il tasso di interesse è definito all'apertura del conto
 */

public class SavingsAccount extends BankAccount {
    public final double INTEREST_RATE = 4.0;
    private double minBalance;

    public SavingsAccount() {
        minBalance = 0.0;
    }

    public SavingsAccount(double balance, double minBalance) {
        super(balance);
        this.minBalance = minBalance;
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
        double balance = getBalance();
        if (balance < minBalance) {
            minBalance = balance;
        }
    }

    public void monthEnd() {
        double interest = minBalance * INTEREST_RATE / 100;
        deposit(interest);
        minBalance = getBalance();
    }

    @Override
    public String toString() {
        return super.toString() + " " + "SavingsAccount{" +
                "INTEREST_RATE=" + INTEREST_RATE +
                ", minBalance=" + minBalance +
                '}';
    }
}
