/*import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private int rollNo;
    private String name;
    private double percentage;

    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public static void sortStudent(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Double.compare(s2.percentage, s1.percentage));
    }

    public static void displayStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Roll No: " + student.rollNo + ", Name: " + student.name + ", Percentage: " + student.percentage);
        }
    }

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

        sortStudent(students);
        displayStudents(students);
    }
}*/
// Package SY
package SY;

public class SYMarks {
    private int computerTotal;
    private int mathsTotal;
    private int electronicsTotal;

    public SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
        this.computerTotal = computerTotal;
        this.mathsTotal = mathsTotal;
        this.electronicsTotal = electronicsTotal;
    }

    public int getComputerTotal() {
        return computerTotal;
    }
}

// Package TY
package TY;

public class TYMarks {
    private int theory;
    private int practicals;

    public TYMarks(int theory, int practicals) {
        this.theory = theory;
        this.practicals = practicals;
    }

    public int getTheory() {
        return theory;
    }

    public int getPracticals() {
        return practicals;
    }
}

// Main package
package main;

import SY.SYMarks;
import TY.TYMarks;

public class Student {
    private int rollNumber;
    private String name;
    private SYMarks syMarks;
    private TYMarks tyMarks;

    public Student(int rollNumber, String name, SYMarks syMarks, TYMarks tyMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    public void displayResult() {
        int computerTotal = syMarks.getComputerTotal() + tyMarks.getTheory();
        char grade;

        if (computerTotal >= 70) {
            grade = 'A';
        } else if (computerTotal >= 60) {
            grade = 'B';
        } else if (computerTotal >= 50) {
            grade = 'C';
        } else if (computerTotal >= 40) {
            grade = 'P';
        } else {
            grade = 'F';
        }

        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Computer Total: " + computerTotal);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        SYMarks syMarks = new SYMarks(80, 70, 90);
        TYMarks tyMarks = new TYMarks(60, 40);
        Student student = new Student(1, "John Doe", syMarks, tyMarks);
        student.displayResult();
    }
}
