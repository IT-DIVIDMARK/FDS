//#Q.1)
/* 
import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
*/


//Q.2)
/* 
import java.awt.event.*;
import javax.swing.*;

class MouseEventExample extends JFrame {
    private JTextField textField;

    public MouseEventExample() {
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 200, 300, 30);
        add(textField);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                textField.setText("Mouse Clicked at: (" + x + ", " + y + ")");
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                setTitle("Mouse Moved at: (" + x + ", " + y + ")");
            }
        });
    }

    public static void main(String[] args) {
        MouseEventExample frame = new MouseEventExample();
        frame.setVisible(true);
    }
}
*/