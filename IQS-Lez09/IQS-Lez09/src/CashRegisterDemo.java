public class CashRegisterDemo {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        CashRegister cashRegister1 = new CashRegister();

        cashRegister.recordPurchase(0.75);
        cashRegister.recordPurchase(1.50);
        System.out.println("Totale della spesa: " + cashRegister.getPurchase());
        cashRegister.receivePayment(3, 0, 0, 0, 0);
        System.out.println("Contante dato: " + cashRegister.getPayment());
        System.out.println("Resto: " + cashRegister.giveChange());

        System.out.println("Valore cassa per il cliente successivo: " + cashRegister.getPurchase());
    }
}
