//Q.1)
/* 
import java.util.function.Function;

public class CubeCalculator {
    public static void main(String[] args) {
        Function<Integer, Integer> cubeFunction = number -> number * number * number;

        int number = 5; // You can change this number as needed
        int cube = cubeFunction.apply(number);

        System.out.println("The cube of " + number + " is: " + cube);
    }
}*/

//Q.2)
/* 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalculator extends JFrame implements ActionListener 
 {
    private JTextField textField;
    private String operator;
    private double num1, num2;

     public SimpleCalculator() 
{
        setTitle("Simple Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        textField = new JTextField();
        add(textField);

        String[] buttons = 
        {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            add(button);
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            textField.setText(textField.getText() + command);
        } else if (command.equals("C")) {
            textField.setText("");
            num1 = num2 = 0;
            operator = "";
        } 
        else if (command.equals("=")) 
        {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) 
            {
                case "+":
                    textField.setText(String.valueOf(num1 + num2));
                    break;
                case "-":
                    textField.setText(String.valueOf(num1 - num2));
                    break;
                case "*":
                    textField.setText(String.valueOf(num1 * num2));
                    break;
                case "/":
                    textField.setText(String.valueOf(num1 / num2));
                    break;
            }
            operator = "";
        } else {
                if (!operator.isEmpty()) 
                {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) 
                    {
                    case "+":
                        num1 += num2;
                        break;
                    case "-":
                        num1 -= num2;
                        break;
                    case "*":
                        num1 *= num2;
                        break;
                    case "/":
                        num1 /= num2;
                        break;
                }
                textField.setText(String.valueOf(num1));
            } else {
                num1 = Double.parseDouble(textField.getText());
            }
            operator = command;
            textField.setText("");
        }
    }

    public static void main(String[] args) 
    {
        new SimpleCalculator();
    }
}

*/