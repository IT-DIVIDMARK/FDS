import java.util.Arrays;
public class SortNumbers1 {
    public static void main(String[] args) {
        if (args.length == 5) {
            try {
                int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).sorted().toArray();
                System.out.println("Sorted numbers: " + Arrays.toString(numbers));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter only integer numbers.");
            }
        } else {
            System.out.println("Please provide exactly 5 numbers as command-line arguments.");
        }
    }
}
