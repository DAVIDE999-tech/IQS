package Bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Sono un cerchio rosso di raggio " + radius + " e di coordinate x " + x + " e y " + y);
    }
}
