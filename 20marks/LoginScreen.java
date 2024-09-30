import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends Frame implements ActionListener {
    private TextField usernameField;
    private TextField passwordField;
    private Label messageLabel;
    private int attemptCount = 0;

    public LoginScreen() {
        // Set up the frame
        setTitle("Login Screen");
        setSize(300, 200);
        setLayout(new FlowLayout());
        
        // Create UI components
        Label usernameLabel = new Label("Username:");
        usernameField = new TextField(20);
        Label passwordLabel = new Label("Password:");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*'); // Hide password input

        Button loginButton = new Button("Login");
        Button clearButton = new Button("Clear");
        
        messageLabel = new Label("");
        
        // Add action listeners
        loginButton.addActionListener(this);
        clearButton.addActionListener(e -> clearFields());

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(clearButton);
        add(messageLabel);
        
        // Add window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Set the frame to be visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle login logic
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (attemptCount < 3) {
            if (!username.equals(password)) {
                attemptCount++;
                messageLabel.setText("Attempt " + attemptCount + ": Username and Password do not match.");
                if (attemptCount == 3) {
                    messageLabel.setText("Maximum attempts reached. Exiting.");
                    System.exit(0);
                }
            } else {
                messageLabel.setText("Login Successful!");
            }
        } else {
            messageLabel.setText("Maximum attempts reached. Exiting.");
            System.exit(0);
        }
    }

    private void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
        messageLabel.setText("");
        attemptCount = 0; // Reset attempt count
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}
