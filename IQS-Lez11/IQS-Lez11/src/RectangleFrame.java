import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RectangleFrame extends JFrame {
    private int width;
    private int height;
    private RectangleComponent rectangleComponent;

    public RectangleFrame(int width, int height) {
        this.width = width;
        this.height = height;
        rectangleComponent = new RectangleComponent(100, 100, 60, 30);
        add(rectangleComponent);
        MouseListener mouseListener = new MousePressedListener();
        rectangleComponent.addMouseListener(mouseListener);
        setSize(width, height);
        setTitle("Una finestra con un rettangolo mobile");
    }

    class MousePressedListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            rectangleComponent.moveRectangle(x, y);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            rectangleComponent.moveRectangle(0, 0);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            rectangleComponent.moveRectangle(100, 100);
        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

}
