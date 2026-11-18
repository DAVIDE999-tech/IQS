package AbstractFactory;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Sono un rettangolo con angoli arrotondati!");
    }
}
