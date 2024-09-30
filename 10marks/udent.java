// Define Student class(roll_no, name, percentage) to create n objects of the Student class.
// Accept details from the user for each object. Define a static method “sortStudent” which
// sorts the array on the basis of percentage.
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    int roll_no;
    String name;
    double percentage;

    // Constructor to initialize Student object
    public Student(int roll_no, String name, double percentage) {
        this.roll_no = roll_no;
        this.name = name;
        this.percentage = percentage;
    }

    // Static method to sort the students based on percentage
    public static void sortStudent(Student[] students) {
        // Sorting the array of students using a comparator on percentage
        Arrays.sort(students, Comparator.comparingDouble(s -> s.percentage));
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + roll_no + ", Name: " + name + ", Percentage: " + percentage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Create an array to hold n Student objects
        Student[] students = new Student[n];

        // Accept details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter roll no: ");
            int roll_no = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter percentage: ");
            double percentage = scanner.nextDouble();

            // Create a new student object and add it to the array
            students[i] = new Student(roll_no, name, percentage);
        }

        // Sort the students based on percentage
        sortStudent(students);

        // Display the sorted students
        System.out.println("\nStudents sorted by percentage:");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }
}
