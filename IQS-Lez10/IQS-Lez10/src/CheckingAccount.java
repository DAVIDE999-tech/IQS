/**
 * Conto usato per le operazioni giornaliere
 * Consente 3 prelievi gratuiti al mese
 * Dal quarto in poi introduce una fee di 1 euro por ogni prelievo
 * A inizio del mese successivo azzera il contatore dei prelievi
 */

public class CheckingAccount extends BankAccount {
    private int withdrawals;

    public CheckingAccount() {
        withdrawals = 0;
    }

    public CheckingAccount(double balance, int witdrawals) {
        super(balance); // Invocazione del costruttore della superclasse
        this.withdrawals = witdrawals;
    }

    public void withdraw(double amount) {
        final int FREE_WITHDRAWALS = 3;
        final double FEE = 1.0;

        super.withdraw(amount);
        withdrawals++;
        if (withdrawals > FREE_WITHDRAWALS) {
            super.withdraw(FEE);
        }
    }

    public void monthEnd() {
        withdrawals = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "CheckingAccount{" +
                "withdrawals=" + withdrawals +
                '}';
    }
}
