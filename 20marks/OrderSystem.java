// Create an abstract class “order” having members id,description.Create two subclasses
// “Purchase Order” and “Sales Order” having members customer name and Vendor name
// respectively.Define methods accept and display in all cases. Create 3 objects each of
// Purchase Order and Sales Order and accept and display details.
import java.util.Scanner;

// Abstract class Order
abstract class Order {
    protected int id;
    protected String description;

    // Abstract methods to be implemented by subclasses
    public abstract void acceptDetails();
    public abstract void displayDetails();
}

// Subclass PurchaseOrder
class PurchaseOrder extends Order {
    private String customerName;

    // Method to accept details for Purchase Order
    @Override
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Purchase Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        System.out.print("Enter Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
    }

    // Method to display Purchase Order details
    @Override
    public void displayDetails() {
        System.out.println("Purchase Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

// Subclass SalesOrder
class SalesOrder extends Order {
    private String vendorName;

    // Method to accept details for Sales Order
    @Override
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sales Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        System.out.print("Enter Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Vendor Name: ");
        vendorName = scanner.nextLine();
    }

    // Method to display Sales Order details
    @Override
    public void displayDetails() {
        System.out.println("Sales Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

// Main class to test the functionality
public class OrderSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array for Purchase Orders
        PurchaseOrder[] purchaseOrders = new PurchaseOrder[3];
        for (int i = 0; i < purchaseOrders.length; i++) {
            System.out.println("\nEntering details for Purchase Order " + (i + 1) + ":");
            purchaseOrders[i] = new PurchaseOrder();
            purchaseOrders[i].acceptDetails();
        }

        // Create an array for Sales Orders
        SalesOrder[] salesOrders = new SalesOrder[3];
        for (int i = 0; i < salesOrders.length; i++) {
            System.out.println("\nEntering details for Sales Order " + (i + 1) + ":");
            salesOrders[i] = new SalesOrder();
            salesOrders[i].acceptDetails();
        }

        // Display Purchase Orders
        System.out.println("\nPurchase Orders Details:");
        for (PurchaseOrder purchaseOrder : purchaseOrders) {
            purchaseOrder.displayDetails();
        }

        // Display Sales Orders
        System.out.println("\nSales Orders Details:");
        for (SalesOrder salesOrder : salesOrders) {
            salesOrder.displayDetails();
        }

        scanner.close();
    }
}
