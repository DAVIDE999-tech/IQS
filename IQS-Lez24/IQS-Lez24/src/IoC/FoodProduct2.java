package IoC;

public class FoodProduct2 implements Product {
    private String description;

    public FoodProduct2() {
        this.description = "Hamburger";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
