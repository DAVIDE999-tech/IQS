import java.util.ArrayList;

public class CashRegisterCoin {
    private double purchase;
    private double payment;

    public CashRegisterCoin() {
        purchase = 0.0;
        payment = 0.0;
    }

    public void recordPurchase(double amount) {
        purchase = purchase + amount;
    }

    public void receivePayment(ArrayList<Coin> coins) {
        for (Coin coin : coins) {  // For each
            payment = payment + coin.getValue();
        }
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0.0;
        payment = 0.0;
        return change;
    }

    public double getPurchase() {
        return purchase;
    }

    public double getPayment() {
        return payment;
    }
}
