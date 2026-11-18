import java.awt.*;

public class AreaMeasurer implements Measurer {
    @Override
    public double measure(Object o) {
        Rectangle rectangle = (Rectangle) o;
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
