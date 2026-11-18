import java.util.Scanner;

/**
 * Creare un insieme di quattro conti correnti
     * Due due di prelievo e due di deposito
     * Simulare qualche operazione
     * Stampare a schermo l'effetto delle operazioni
 */

public class BankAccountDemo {
    public static void main(String[] args) {
        final int ACCOUNT_SIZE = 4;

        BankAccount[] conti = new BankAccount[ACCOUNT_SIZE];
        conti[0] = new CheckingAccount();
        conti[1] = new CheckingAccount();
        conti[2] = new SavingsAccount();
        conti[3] = new SavingsAccount();

        // TO DO
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.print("D)eposito  W)Prelievo  M)Fine mese  Q) Per terminare ");
            String input = in.next();
            if (input.equals("D") || input.equals("W")) {
                System.out.print("Inserire numero conto e importo: ");
                int num = in.nextInt();
                double amount = in.nextDouble();

                if (input.equals("D")) {
                    conti[num].deposit(amount);
                } else {
                    conti[num].withdraw(amount);
                }
                System.out.println("Il saldo del conto è: " + conti[num].getBalance());
            } else if (input.equals("M")) {
                for (int n = 0; n < conti.length; n++) {
                    conti[n].monthEnd();
                    System.out.println("Conto corrente n " + n + " saldo " + conti[n].getBalance());
                    System.out.println("Prova del metodo toString " + conti[n].toString());
                    System.out.println("Verifico se il conto corrente 0 è uguala al conto corrente 1: " + conti[0].equals(conti[1]));
                }
            } else if (input.equals("Q")) {
                done = true;
            }
        }
    }
}
