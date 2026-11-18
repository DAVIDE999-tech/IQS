package IoC;

public class DrinkProduct implements Product {
    private String description;

    public DrinkProduct() {
        this.description = "Drink";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
