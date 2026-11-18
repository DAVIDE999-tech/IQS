import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {
    private int x;
    private int y;
    private int width;
    private int height;
    private Rectangle rectangle;

    public RectangleComponent(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        rectangle = new Rectangle(x, y, width, height);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(rectangle);
    }

    public void moveRectangle(int x, int y) {
        rectangle.setLocation(x, y);
        repaint();
    }
}
