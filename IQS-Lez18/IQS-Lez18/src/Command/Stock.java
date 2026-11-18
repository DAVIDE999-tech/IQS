package Command;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Stock di nome " + name + " e quantità " + quantity + " venduto.");
    }

    public void sell() {
        System.out.println("Stock di nome " + name + " e quantità " + quantity + " acquistato.");
    }
}
