/*public class MyNumber {
    private int number;

    public MyNumber() {
        this.number = 0;
    }

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isZero() {
        return number == 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer argument.");
            return;
        }

        try {
            int value = Integer.parseInt(args[0]);
            MyNumber myNumber = new MyNumber(value);

            System.out.println("Number: " + myNumber.number);
            System.out.println("Is negative: " + myNumber.isNegative());
            System.out.println("Is positive: " + myNumber.isPositive());
            System.out.println("Is zero: " + myNumber.isZero());
            System.out.println("Is odd: " + myNumber.isOdd());
            System.out.println("Is even: " + myNumber.isEven());
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer argument.");
        }
    }
}*/
import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends Frame {
    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;
    private Button clearButton;
    private Label messageLabel;
    private int attempts = 0;

    public LoginScreen() {
        setLayout(new FlowLayout());

        Label usernameLabel = new Label("Username:");
        usernameField = new TextField(20);

        Label passwordLabel = new Label("Password:");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');

        loginButton = new Button("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        clearButton = new Button("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        messageLabel = new Label("");

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(clearButton);
        add(messageLabel);

        setSize(300, 200);
        setVisible(true);
    }

    private void login() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals(password)) {
            messageLabel.setText("Login successful!");
        } else {
            attempts++;
            if (attempts < 3) {
                messageLabel.setText("Invalid username or password. Attempts remaining: " + (3 - attempts));
            } else {
                throw new RuntimeException("Maximum login attempts exceeded!");
            }
        }
    }

    private void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
        messageLabel.setText("");
        attempts = 0;
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}