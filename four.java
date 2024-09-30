/*import java.util.Date;
import java.text.SimpleDateFormat;

public class four {
    public static void main(String[] args) {
        Date currentDate = new Date();


        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is : " + format1.format(currentDate));


        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is : " + format2.format(currentDate));


        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is : " + format3.format(currentDate));


        SimpleDateFormat format4 = new SimpleDateFormat("EEEE MMMM dd HH:mm:ss z yyyy");
        System.out.println("Current date and time is : " + format4.format(currentDate));


        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy hh:mm:ss a z");
        System.out.println("Current date and time is : " + format5.format(currentDate));


        SimpleDateFormat format6 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time is : " + format6.format(currentDate));


        SimpleDateFormat format7 = new SimpleDateFormat("W");
        System.out.println("Current week of year is : " + format7.format(currentDate));


        int weekOfMonth = (currentDate.getDate() - 1) / 7 + 1;
        System.out.println("Current week of month : " + weekOfMonth);


        SimpleDateFormat format8 = new SimpleDateFormat("D");
        System.out.println("Current day of the year is : " + format8.format(currentDate));
    }
}*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventListener extends JFrame {
    private JTextField textField;

    public MouseEventListener() {
        // Create a text field to display the mouse click position
        textField = new JTextField(20);
        textField.setEditable(false);

        // Create a panel to handle mouse events
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Get the mouse click position
                int x = e.getX();
                int y = e.getY();

                // Display the mouse click position in the text field
                textField.setText("Mouse clicked at (" + x + ", " + y + ")");
            }
        });
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Get the mouse position
                int x = e.getX();
                int y = e.getY();

                // Display the mouse position in the text field
                textField.setText("Mouse moved to (" + x + ", " + y + ")");
            }
        });

        // Add the panel and text field to the frame
        add(panel, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);

        // Set the frame properties
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventListener();
    }
}