//Q.1)
/* 
import java.util.Scanner;

 class Rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
*/

//Q.2)
/*
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public void acceptDate() throws InvalidDateException {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter date (dd mm yyyy): ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid Date: " + day + " " + month + " " + year);
        }
    }

    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (isLeapYear(year)) ? 29 : 28;
            default:
                return 0;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        try {
            date.acceptDate();
            date.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
*/