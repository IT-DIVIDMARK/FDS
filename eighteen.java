import java.util.Scanner;

class Employee {
    int id;
    String name;
    String deptName;
    double salary;
    static int count = 0;

    Employee() {
        this(0, "", "", 0.0);
    }

    Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department Name: " + deptName);
        System.out.println("Salary: " + salary);
    }

    static void displayCount() {
        System.out.println("Object Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee details for employee " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter department name: ");
            String deptName = sc.next();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, deptName, salary);
            emp.display();
            Employee.displayCount();
            System.out.println();
        }
    }
}
/*
import java.util.Scanner;

class CovidException extends Exception {
    public CovidException(String message) {
        super(message);
    }
}

class Patient {
    String patientName;
    int patientAge;
    double patientOxyLevel;
    int patientHRCTReport;

    Patient(String patientName, int patientAge, double patientOxyLevel, int patientHRCTReport) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientOxyLevel = patientOxyLevel;
        this.patientHRCTReport = patientHRCTReport;
    }

    void display() throws CovidException {
        if (patientOxyLevel < 95 && patientHRCTReport > 10) {
            throw new CovidException("Patient is Covid Positive(+) and Need to Hospitalized");
        } else {
            System.out.println("Patient Name: " + patientName);
            System.out.println("Patient Age: " + patientAge);
            System.out.println("Patient Oxygen Level: " + patientOxyLevel);
            System.out.println("Patient HRCT Report: " + patientHRCTReport);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = sc.next();
        System.out.print("Enter patient age: ");
        int patientAge = sc.nextInt();
        System.out.print("Enter patient oxygen level: ");
        double patientOxyLevel = sc.nextDouble();
        System.out.print("Enter patient HRCT report: ");
        int patientHRCTReport = sc.nextInt();

        Patient patient = new Patient(patientName, patientAge, patientOxyLevel, patientHRCTReport);
        try {
            patient.display();
        } catch (CovidException e) {
            System.out.println(e.getMessage());
        }
    }
}
*/