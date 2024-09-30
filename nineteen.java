import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Original Contents:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line.toUpperCase());
            }

            scanner.close();

            scanner = new Scanner(file);
            System.out.println("\nContents in Reverse Order:");
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.insert(0, scanner.nextLine() + "\n");
            }
            System.out.println(sb.toString());

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
/*
import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class OfficeStaff extends Staff {
    String department;

    OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of office staff: ");
        int n = sc.nextInt();

        OfficeStaff[] staff = new OfficeStaff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter office staff details for staff " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter department: ");
            String department = sc.next();

            staff[i] = new OfficeStaff(id, name, department);
        }

        System.out.println("Office Staff Details:");
        for (OfficeStaff s : staff) {
            s.display();
            System.out.println();
        }
    }
}
*/