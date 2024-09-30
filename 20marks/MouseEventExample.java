import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame {
    private JTextField textField;

    public MouseEventExample() {
        // Set up the frame
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create and set up the text field
        textField = new JTextField();
        textField.setBounds(50, 200, 300, 30);
        add(textField);

        // Add mouse listener
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Get the position of the mouse click
                int x = e.getX();
                int y = e.getY();
                // Display the position in the text field
                textField.setText("Mouse Clicked at: (" + x + ", " + y + ")");
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Optional: You can handle mouse moved events here
                int x = e.getX();
                int y = e.getY();
                // For example, display current mouse position in the console
                System.out.println("Mouse Moved to: (" + x + ", " + y + ")");
            }
        });

        // Set the frame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseEventExample());
    }
}
