// Write a program to read a text file “sample.txt” and display the contents of a file in
// reverse order and also original contents change the case (display in upper case).
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class FileReaderReverseAndUpperCase {

    public static void main(String[] args) {
        String fileName = "sample.txt";  // File to be read
        Stack<String> lines = new Stack<>();  // Stack to store lines in reverse order

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            // Read each line from the file and push it to the stack
            while ((line = br.readLine()) != null) {
                lines.push(line);  // Add the line to the stack
            }

            // Display the file content in reverse order
            System.out.println("Contents of the file in reverse order:");
            while (!lines.isEmpty()) {
                String reverseLine = lines.pop();
                System.out.println(reverseLine);
            }

            System.out.println("\nOriginal contents in upper case:");
            
            // Read the file again to display original contents in uppercase
            try (BufferedReader brUpper = new BufferedReader(new FileReader(fileName))) {
                while ((line = brUpper.readLine()) != null) {
                    System.out.println(line.toUpperCase());
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
