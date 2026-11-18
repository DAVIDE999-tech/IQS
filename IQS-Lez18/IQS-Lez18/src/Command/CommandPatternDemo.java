package Command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("MacBookPro 16 pollici M6", 10); // Definisce la merce

        BuyStock buyStockOrder = new BuyStock(stock); // Qualcuno la vuole acquistare
        SellStock sellStockOrder = new SellStock(stock); // Qualcunpo ce l'ha in magazzino da vendere

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder); // Il broker conosce l'acquirente
        broker.takeOrder(sellStockOrder); // Il broker contatta il venditore

        broker.palceOrders(); // Esegue l'operazione di vendita
    }
}
