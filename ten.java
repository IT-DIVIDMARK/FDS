/*import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name (first middle last): ");
        String name = scanner.nextLine();

        String[] names = name.split(" ");
        if (names.length != 3) {
            System.out.println("Invalid name format. Please enter in the format of first middle last.");
            return;
        }

        String firstName = names[0];
        String middleName = names[1].substring(0, 1).toUpperCase() + names[1].substring(1).toLowerCase();
        String lastName = names[2];

        System.out.println("Formatted Name: " + lastName + ", " + firstName + " " + middleName);
    }
}*/
// Define the interface Operation
interface Operation {
    double area();
    double volume();
}

// Define the class Cylinder that implements the Operation interface
class Cylinder implements Operation {
    private double radius;
    private double height;
    private static final double PI = 3.142;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return PI * radius * radius * height;
    }

    public static void main(String[] args) {
        // Create an object of the Cylinder class
        Cylinder cylinder = new Cylinder(5, 10);

        // Calculate and print the area and volume
        System.out.println("Area: " + cylinder.area());
        System.out.println("Volume: " + cylinder.volume());
    }
}