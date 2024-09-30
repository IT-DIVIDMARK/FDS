// Write a program to find the cube of given number using function interface.
import java.util.function.Function;
import java.util.Scanner;

public class CubeUsingFunctionInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a number to find its cube: ");
        int number = scanner.nextInt();

        // Define a Function to calculate the cube of a number
        Function<Integer, Integer> cubeFunction = n -> n * n * n;

        // Apply the function to calculate the cube
        int cube = cubeFunction.apply(number);

        // Display the result
        System.out.priimport java.util.Scanner;

        public class MenuDrivenProgram {
            private static Scanner scanner = new Scanner(System.in);
        
            public static void main(String[] args) {
                while (true) {
                    System.out.println("Menu:");
                    System.out.println("1. Calculate Volume of Cylinder");
                    System.out.println("2. Find Factorial of Given Number");
                    System.out.println("3. Check if Number is Armstrong or Not");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option (1-4): ");
                    int choice = scanner.nextInt();
        
                    switch (choice) {
                        case 1:
                            calculateVolumeOfCylinder();
                            break;
                        case 2:
                            findFactorial();
                            break;
                        case 3:
                            checkArmstrong();
                            break;
                        case 4:
                            System.out.println("Exiting...");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    System.out.println();
                }
            }
        
            // Method to calculate the volume of a cylinder
            private static void calculateVolumeOfCylinder() {
                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();
                double volume = Math.PI * Math.pow(radius, 2) * height;
                System.out.printf("The volume of the cylinder is: %.2f%n", volume);
            }
        
            // Method to find the factorial of a number
            private static void findFactorial() {
                System.out.print("Enter a non-negative integer: ");
                int number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                    return;
                }
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("The factorial of " + number + " is: " + factorial);
            }
        
            // Method to check if a number is Armstrong
            private static void checkArmstrong() {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                int originalNumber = number;
                int sum = 0;
                int digits = String.valueOf(number).length();
        
                while (number != 0) {
                    int digit = number % 10;
                    sum += Math.pow(digit, digits);
                    number /= 10;
                }
        
                if (sum == originalNumber) {
                    System.out.println(originalNumber + " is an Armstrong number.");
                } else {
                    System.out.println(originalNumber + " is not an Armstrong number.");
                }
            }
        }
        ntln("The cube of " + number + " is: " + cube);

        scanner.close();
    }
}
