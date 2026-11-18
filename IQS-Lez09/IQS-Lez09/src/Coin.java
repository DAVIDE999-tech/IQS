public class Coin {
    private final double value; // Esempio: 1
    private final String name; // Esempio "Euro"

    public Coin(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
