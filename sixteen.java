import java.util.Arrays;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double percentage;

    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public static Student[] sortStudents(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Double.compare(s2.percentage, s1.percentage));
        return students;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll no: ");
            int rollNo = scanner.nextInt();
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter percentage: ");
            double percentage = scanner.nextDouble();
            students[i] = new Student(rollNo, name, percentage);
        }

        students = Student.sortStudents(students);

        System.out.println("Students in sorted order of percentage:");
        for (Student student : students) {
            System.out.println("Roll No: " + student.rollNo);
            System.out.println("Name: " + student.name);
            System.out.println("Percentage: " + student.percentage);
            System.out.println();
        }
    }
}
/*
import java.util.Scanner;

abstract class Order {
    int id;
    String description;

    Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
    }

    abstract void accept(Scanner sc);
}

class PurchaseOrder extends Order {
    String customerName;

    PurchaseOrder(int id, String description) {
        super(id, description);
    }

    void accept(Scanner sc) {
        System.out.print("Enter customer name: ");
        customerName = sc.next();
    }

    void display() {
        super.display();
        System.out.println("Customer Name: " + customerName);
    }
}

class SalesOrder extends Order {
    String vendorName;

    SalesOrder(int id, String description) {
        super(id, description);
    }

    void accept(Scanner sc) {
        System.out.print("Enter vendor name: ");
        vendorName = sc.next();
    }

    void display() {
        super.display();
        System.out.println("Vendor Name: " + vendorName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PurchaseOrder[] po = new PurchaseOrder[3];
        SalesOrder[] so = new SalesOrder[3];

        for (int i = 0; i < 3; i++) {
            po[i] = new PurchaseOrder(i + 1, "Purchase Order " + (i + 1));
            po[i].accept(sc);
            so[i] = new SalesOrder(i + 1, "Sales Order " + (i + 1));
            so[i].accept(sc);
        }

        System.out.println("Purchase Orders:");
        for (PurchaseOrder p : po) {
            p.display();
            System.out.println();
        }

        System.out.println("Sales Orders:");
        for (SalesOrder s : so) {
            s.display();
            System.out.println();
        }
    }
}*/