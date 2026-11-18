package Bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Sono un cerchio verde di raggio " + radius + " e di coordinate x " + x + " e y " + y);
    }
}
