/*import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Length: ");
        double l = s.nextDouble();
        System.out.print("Breadth: ");
        double b = s.nextDouble();
        double a = l * b;
        double p = 2 * (l + b);
        System.out.println("Area: " + a);
        System.out.println("Perimeter: " + p);
        s.close();
    }
}*/

abstract class Order {
    protected int id;
    protected String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public abstract void accept();
    public abstract void display();
}


class PurchaseOrder extends Order {
    private String customerName;

    public PurchaseOrder(int id, String description) {
        super(id, description);
    }

    @Override
    public void accept() { // Added public access modifier
        System.out.print("Enter customer name: ");
        customerName = System.console().readLine();
    }

    @Override
    public void display() { // Added public access modifier
        System.out.println("Purchase Order Details:");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
        System.out.println();
    }
}


class SalesOrder extends Order {
    private String vendorName;

    public SalesOrder(int id, String description) {
        super(id, description);
    }

    @Override
    public void accept() { // Added public access modifier
        System.out.print("Enter vendor name: ");
        vendorName = System.console().readLine();
    }

    @Override
    public void display() { // Added public access modifier
        System.out.println("Sales Order Details:");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {

        PurchaseOrder[] purchaseOrders = new PurchaseOrder[3];
        for (int i = 0; i < 3; i++) {
            purchaseOrders[i] = new PurchaseOrder(i + 1, "Purchase Order " + (i + 1));
            purchaseOrders[i].accept();
        }


        SalesOrder[] salesOrders = new SalesOrder[3];
        for (int i = 0; i < 3; i++) {
            salesOrders[i] = new SalesOrder(i + 4, "Sales Order " + (i + 1));
            salesOrders[i].accept();
        }


        System.out.println("\nDisplaying all orders:");
        for (PurchaseOrder po : purchaseOrders) {
            po.display();
        }
        for (SalesOrder so : salesOrders) {
            so.display();
        }
    }
}
