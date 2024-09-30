//Q.1
/* 
abstract class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayDetails();
}

class OfficeStaff extends Staff {
    private String department;

    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

class Main{
    public static void main(String[] args) {
        int n = 3; // number of OfficeStaff objects to create
        OfficeStaff[] staff = new OfficeStaff[n];

        staff[0] = new OfficeStaff(1, "John Doe", "HR");
        staff[1] = new OfficeStaff(2, "Jane Smith", "IT");
        staff[2] = new OfficeStaff(3, "Bob Johnson", "Marketing");

        for (OfficeStaff os : staff) {
            os.displayDetails();
        }
    }
}

*/
//Q.2)

/* 
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double bookPrice;
    int bookQty;

    public Book(int bookId, String bookName, double bookPrice, int bookQty) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookQty = bookQty;
    }

    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + 
               ", Book Price: " + bookPrice + ", Quantity: " + bookQty;
    }

    public double totalCost() {
        return bookPrice * bookQty;
    }
}

 class BookManagement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomAccessFile raf;

        try {
            raf = new RandomAccessFile("book.dat", "rw");
            while (true) {
                System.out.println("1. Search for a specific book by name");
                System.out.println("2. Display all books and total cost");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter the book name to search: ");
                        String searchName = scanner.nextLine();
                        searchBookByName(raf, searchName);
                        break;
                    case 2:
                        displayAllBooks(raf);
                        break;
                    case 3:
                        raf.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void searchBookByName(RandomAccessFile raf, String bookName) throws IOException {
        raf.seek(0);
        String line;
        boolean found = false;

        while ((line = raf.readLine()) != null) {
            String[] data = line.split(",");
            if (data[1].trim().equalsIgnoreCase(bookName)) {
                System.out.println("Book found: " + line);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public static void displayAllBooks(RandomAccessFile raf) throws IOException {
        raf.seek(0);
        String line;
        double totalCost = 0;

        System.out.println("Books in the file:");
        while ((line = raf.readLine()) != null) {
            String[] data = line.split(",");
            Book book = new Book(
                Integer.parseInt(data[0].trim()),
                data[1].trim(),
                Double.parseDouble(data[2].trim()),
                Integer.parseInt(data[3].trim())
            );
            System.out.println(book);
            totalCost += book.totalCost();
        }
        System.out.println("Total Cost of All Books: " + totalCost);
    }
}
*/

