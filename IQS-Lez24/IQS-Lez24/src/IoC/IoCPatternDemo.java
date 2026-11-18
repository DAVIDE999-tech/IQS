package IoC;

public class IoCPatternDemo {
    public static void main(String[] args) {
        Store store1 = StoreFactory.getStore("Food store");
        try {
            System.out.println(store1.getProduct().getDescription());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
