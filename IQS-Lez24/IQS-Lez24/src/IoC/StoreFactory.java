package IoC;

public class StoreFactory {
    public static Store getStore(String storeType) {
        if (storeType == null) {
            return null;
        }
        if (storeType.equalsIgnoreCase("Food store")) {
            return new Store("Tutto da mangiare", new FoodProduct2()); //Concreta iniezione del codice
        } else if (storeType.equalsIgnoreCase("Drink store")) {
            return new Store("Quanta sete", new DrinkProduct()); //Concreta iniezione del codice
        }
        return null;
    }
}
