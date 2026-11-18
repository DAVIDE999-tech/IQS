package AbstractFactory;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Sono un quadrato con angoli arrotondati!");
    }
}
