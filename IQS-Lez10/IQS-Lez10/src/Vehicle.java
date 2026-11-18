public class Vehicle {
    private int numberOfTires;

    public Vehicle() {
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public String getDescription() {
        return "Sono un veicolo con " + numberOfTires + " ruote";
    }

    @Override
    public String toString() {
        return "Sono un veicolo con " + numberOfTires + " ruote";
    }
}
