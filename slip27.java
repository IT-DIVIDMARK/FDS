//Q.1)
/* 
import java.util.Scanner;

 class ReverseArray 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/

//#Q.2)

/* 
import java.awt.*;
import java.awt.event.*;

class LoginScreen extends Frame implements ActionListener {
    private TextField usernameField, passwordField;
    private Button loginButton, clearButton;
    private Label messageLabel;
    private int attempts = 3;

    public LoginScreen() {
        setTitle("Login Screen");
        setSize(400, 200);
        setLayout(new FlowLayout());

        Label usernameLabel = new Label("Username:");
        Label passwordLabel = new Label("Password:");
        usernameField = new TextField(20);
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');

        loginButton = new Button("Login");
        clearButton = new Button("Clear");
        messageLabel = new Label();

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(clearButton);
        add(messageLabel);

        loginButton.addActionListener(this);
        clearButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            try {
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (username.equals(password)) {
                    messageLabel.setText("Login successful!");
                } else {
                    attempts--;
                    if (attempts > 0) {
                        throw new Exception("Invalid login. You have " + attempts + " attempts left.");
                    } else {
                        throw new Exception("No attempts left! Access blocked.");
                    }
                }
            } catch (Exception ex) {
                messageLabel.setText(ex.getMessage());
            }
        } else if (e.getSource() == clearButton) {
            usernameField.setText("");
            passwordField.setText("");
            messageLabel.setText("");
        }
    }

    public static void main(String[] args) {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
    }
}

*/