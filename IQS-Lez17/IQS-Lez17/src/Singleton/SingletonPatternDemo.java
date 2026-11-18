package Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();

        SingleObject singleObject1 = SingleObject.getInstance();
        singleObject1.showMessage();
    }
}
