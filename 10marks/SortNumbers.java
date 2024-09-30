// Write a java program to accept 5 numbers using command line arguments sort and
// display them.



import java.util.Arrays;

public class SortNumbers {

    public static void main(String[] args) {
        // Check if exactly 5 numbers are provided as command-line arguments
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 numbers as command-line arguments.");
            return;
        }

        try {
            // Create an array to hold the numbers
            int[] numbers = new int[5];

            // Convert the command-line arguments to integers and store in the array
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            // Sort the array
            Arrays.sort(numbers);

            // Display the sorted numbers
            System.out.println("Sorted numbers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter only integer numbers.");
        }
    }
}
