// Write a java program that take input as a person name in the format of first, middle
// and last name and then print it in the form last, first and middle name, where in the
// middle name first character is capital letter.
import java.util.Scanner;

public class NameFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the full name from the user
        System.out.print("Enter your full name (first middle last): ");
        String f = scanner.next();
        String m = scanner.next();
        String l = scanner.next();

        // Capitalize the first letter of the middle name
        m= m.substring(0, 1).toUpperCase() + m.substring(1).toLowerCase();

        // Print the name in the format: last, first middle
        System.out.println("Formatted Name: " + l + ", " + f+ " " + m);

        scanner.close();
    }
}
