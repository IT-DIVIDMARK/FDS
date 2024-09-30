//#Q.1)
/* 
import java.util.function.Function;

 class CubeCalculator {
    public static void main(String[] args) {
        Function<Integer, Integer> cubeFunction = number -> number * number * number;

        int number = 5; // You can change this number as needed
        int cube = cubeFunction.apply(number);

        System.out.println("The cube of " + number + " is: " + cube);
    }
}
*/

//Q.2)
/* 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

 class UserInfoForm extends JFrame implements ActionListener {
    private JTextField nameField;
    private JTextField classField;
    private JTextArea hobbiesArea;
    private JTextArea displayArea;
    private JButton submitButton;

    public UserInfoForm() {
        setTitle("User Information Form");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        nameField = new JTextField();
        classField = new JTextField();
        hobbiesArea = new JTextArea(3, 20);
        displayArea = new JTextArea(5, 20);
        submitButton = new JButton("Submit");

        submitButton.addActionListener(this);

        JPanel namePanel = new JPanel(new FlowLayout());
        namePanel.add(new JLabel("Name: "));
        namePanel.add(nameField);

        JPanel classPanel = new JPanel(new FlowLayout());
        classPanel.add(new JLabel("Class: "));
        classPanel.add(classField);

        JPanel hobbiesPanel = new JPanel(new FlowLayout());
        hobbiesPanel.add(new JLabel("Hobbies: "));
        hobbiesPanel.add(hobbiesArea);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(submitButton);

        JPanel displayPanel = new JPanel(new FlowLayout());
        displayPanel.add(new JLabel("Selected Options: "));
        displayPanel.add(displayArea);

        add(namePanel);
        add(classPanel);
        add(hobbiesPanel);
        add(buttonPanel);
        add(displayPanel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String userClass = classField.getText();
        String hobbies = hobbiesArea.getText();

        StringBuilder displayText = new StringBuilder();
        displayText.append("Name: ").append(name).append("\n");
        displayText.append("Class: ").append(userClass).append("\n");
        displayText.append("Hobbies: ").append(hobbies).append("\n");

        displayArea.setText(displayText.toString());
    }

    public static void main(String[] args) {
        new UserInfoForm();
    }
}

*/