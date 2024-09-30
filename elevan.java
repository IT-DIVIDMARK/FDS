/*import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter length: ");
    double length = scanner.nextDouble();

    System.out.print("Enter breadth: ");
    double breadth = scanner.nextDouble();

    double area = length * breadth;
    double perimeter = 2 * (length + breadth);

    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
  }
}*/

// Package SY
package SY;

public class SYMarks {
  private int ComputerTotal;
  private int MathsTotal;
  private int ElectronicsTotal;

  public SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
    this.ComputerTotal = computerTotal;
    this.MathsTotal = mathsTotal;
    this.ElectronicsTotal = electronicsTotal;
  }

  public int getComputerTotal() {
    return ComputerTotal;
  }
}

// Package TY
package TY;

public class TYMarks {
  private int Theory;
  private int Practicals;

  public TYMarks(int theory, int practicals) {
    this.Theory = theory;
    this.Practicals = practicals;
  }

  public int getTheory() {
    return Theory;
  }

  public int getPracticals() {
    return Practicals;
  }
}

// Main class
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
    char grade = calculateGrade(computerTotal);

    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Name: " + name);
    System.out.println("Computer Total: " + computerTotal);
    System.out.println("Grade: " + grade);
  }

  private char calculateGrade(int total) {
    if (total >= 70) {
      return 'A';
    } else if (total >= 60) {
      return 'B';
    } else if (total >= 50) {
      return 'C';
    } else if (total >= 40) {
      return 'P';
    } else {
      return 'F';
    }
  }

  public static void main(String[] args) {
    SYMarks syMarks = new SYMarks(80, 70, 90);
    TYMarks tyMarks = new TYMarks(60, 80);
    Student student = new Student(1, "John Doe", syMarks, tyMarks);
    student.displayResult();
  }
}