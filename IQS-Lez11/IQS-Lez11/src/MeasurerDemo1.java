import java.awt.*;

public class MeasurerDemo1 {
    public static void main(String[] args) {
        Rectangle[] rettangoli = new Rectangle[3];
        rettangoli[0] = new Rectangle(10, 20, 200, 300);
        rettangoli[1] = new Rectangle(50, 100, 100, 100);
        rettangoli[2] = new Rectangle(100, 200, 100, 200);

        System.out.println("Area 1°: " + rettangoli[0].getHeight() * rettangoli[0].getWidth());
        System.out.println("Area 2°: " + rettangoli[1].getHeight() * rettangoli[1].getWidth());
        System.out.println("Area 3°: " + rettangoli[2].getHeight() * rettangoli[2].getWidth());

        System.out.println("Media delle aree: " +
                Algoritmo1.media(rettangoli,
                        (Object o) -> ((Rectangle) o).getWidth() * ((Rectangle) o).getHeight()));

        System.out.println("Media dei perimetri: " +
                Algoritmo1.media(rettangoli,
                        (Object o) -> 2 * ((Rectangle) o).getWidth() + ((Rectangle) o).getHeight()));
    }
}
