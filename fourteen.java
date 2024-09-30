import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Menu:");
      System.out.println("1. Calculate volume of cylinder");
      System.out.println("2. Find factorial of a number");
      System.out.println("3. Check if a number is Armstrong");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          calculateVolumeOfCylinder(scanner);
          break;
        case 2:
          findFactorial(scanner);
          break;
        case 3:
          checkArmstrong(scanner);
          break;
        case 4:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  private static void calculateVolumeOfCylinder(Scanner scanner) {
    System.out.print("Enter radius: ");
    double radius = scanner.nextDouble();
    System.out.print("Enter height: ");
    double height = scanner.nextDouble();

    double volume = Math.PI * radius * radius * height;
    System.out.println("Volume of cylinder: " + volume);
  }

  private static void findFactorial(Scanner scanner) {
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }
    System.out.println("Factorial of " + number + ": " + factorial);
  }

  private static void checkArmstrong(Scanner scanner) {
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int sum = 0;
    int temp = number;
    while (temp != 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, 3);
      temp /= 10;
    }

    if (sum == number) {
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }
  }
}
/*
import java.util.Scanner;
interface Operation {
  double area();
  double volume();
}

class Cylinder implements Operation {
  private double radius;
  private double height;
  private static final double PI = 3.142;

  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  public double area() {
    return 2 * PI * radius * (radius + height);
  }

  public double volume() {
    return PI * radius * radius * height;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter radius: ");
    double radius = scanner.nextDouble();
    System.out.print("Enter height: ");
    double height = scanner.nextDouble();

    Cylinder cylinder = new Cylinder(radius, height);

    System.out.println("Area: " + cylinder.area());
    System.out.println("Volume: " + cylinder.volume());
  }
}
