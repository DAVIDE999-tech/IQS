import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonViewer {
    public static void main(String[] args) {
        class InternalClickListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mi hanno cliccato!");
            }
        }

        JFrame frame = new JFrame();
        JButton button = new JButton("Cliccami!");
        frame.add(button);

        ActionListener listener = new InternalClickListener();

        button.addActionListener(listener);
        //button.addActionListener((ActionEvent e) -> System.out.println("Mi hanno cliccato!"));

        frame.setSize(800, 400);
        frame.setTitle("Una finestra con un pulsante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
