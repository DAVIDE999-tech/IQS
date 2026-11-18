import java.util.ArrayList;

public class CashRegisterCoinDemo {
    public static void main(String[] args) {
        CashRegisterCoin cashRegister = new CashRegisterCoin();

        cashRegister.recordPurchase(0.75);
        cashRegister.recordPurchase(1.50);
        System.out.println("Totale della spesa: " + cashRegister.getPurchase());
        ArrayList<Coin> coins = new ArrayList<>();
        coins.add(new Coin(1, "Euro"));
        coins.add(new Coin(1, "Euro"));
        coins.add(new Coin(0.5, "Euro"));
        coins.add(new Coin(0.5, "Euro"));
        coins.add(new Coin(0.5, "Euro"));
        coins.add(new Coin(0.2, "Euro"));
        cashRegister.receivePayment(coins);
        System.out.println("Contante dato: " + cashRegister.getPayment());
        System.out.println("Resto: " + Math.round(cashRegister.giveChange() * 100)/100.0);

        System.out.println("Valore cassa per il cliente successivo: " + cashRegister.getPurchase());
    }
}