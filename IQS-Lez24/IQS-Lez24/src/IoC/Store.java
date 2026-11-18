package IoC;

public class Store {
    private String storeName;
    private Product product; // Non è una rigida dipendenza perché parto dall'interfaccia

    public Store(String storeName, Product product) {
        this.storeName = storeName;
        this.product = product;
    }

    public String getStoreName() {
        return storeName;
    }

    public Product getProduct() {
        return product;
    }
}
