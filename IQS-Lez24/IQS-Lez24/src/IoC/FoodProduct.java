package IoC;

public class FoodProduct implements Product {
    private String description;

    public FoodProduct() {
        this.description = "Food";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
