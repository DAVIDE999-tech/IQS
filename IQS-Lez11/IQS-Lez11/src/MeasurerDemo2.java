import java.awt.*;

public class MeasurerDemo2 {
    public static void main(String[] args) {

        class InternalAreaMeasurer implements Measurer {
            @Override
            public double measure(Object o) {
                Rectangle rectangle = (Rectangle) o;
                return rectangle.getWidth() * rectangle.getHeight();
            }
        }

        Measurer measurer = new InternalAreaMeasurer();

        Rectangle[] rettangoli = new Rectangle[3];
        rettangoli[0] = new Rectangle(10, 20, 200, 300);
        rettangoli[1] = new Rectangle(50, 100, 100, 100);
        rettangoli[2] = new Rectangle(100, 200, 100, 200);

        System.out.println("Area 1°: " + measurer.measure(rettangoli[0]));
        System.out.println("Area 2°: " + measurer.measure(rettangoli[1]));
        System.out.println("Area 3°: " + measurer.measure(rettangoli[2]));

        System.out.println("Media: " + Algoritmo1.media(rettangoli, measurer));
    }
}
