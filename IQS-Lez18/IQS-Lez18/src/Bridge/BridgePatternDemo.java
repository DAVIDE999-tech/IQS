package Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 50, 100, 200);
        Shape greenCicrle = new Circle(new GreenCircle(), 200, 400, 600);

        redCircle.draw();
        greenCicrle.draw();
    }
}
