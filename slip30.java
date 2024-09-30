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

//Q.1)
/* 

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

class EmailId {
    private String username;
    private String password;

    public EmailId() {
        this.username = "defaultUser";
        this.password = "defaultPass";
    }

    public EmailId(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
        if (!isValidUsername(username)) {
            throw new InvalidUsernameException("Invalid Username: " + username);
        }
        if (!isValidPassword(password)) {
            throw new InvalidPasswordException("Invalid Password: " + password);
        }
        this.username = username;
        this.password = password;
    }

    private boolean isValidUsername(String username) {
        return username != null && username.length() >= 5;
    }

    private boolean isValidPassword(String password) {
        return password != null && password.length() >= 8;
    }

    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

class EmailIdTest {
    public static void main(String[] args) {
        try {
            String username = args[0];
            String password = args[1];
            EmailId email = new EmailId(username, password);
            email.display();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide both username and password as command line arguments.");
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
*/
