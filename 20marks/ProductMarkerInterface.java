// Marker Interface
interface ProductMarker {
    // No methods or fields
}

// Class Product implementing the marker interface
class Product implements ProductMarker {
    private static int objectCount = 0; // Static variable to count objects
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;

    // Default constructor
    public Product() {
        this.productId = 0;
        this.productName = "Unknown";
        this.productCost = 0.0;
        this.productQuantity = 0;
        objectCount++; // Increment count when an object is created
    }

    // Parameterized constructor
    public Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        objectCount++; // Increment count when an object is created
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: " + productCost);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println();
    }

    // Static method to get the count of product objects
    public static int getObjectCount() {
        return objectCount;
    }
}

// Main class to test the functionality
public class ProductMarkerInterface {
    public static void main(String[] args) {
        // Creating objects of Product
        Product product1 = new Product(101, "Laptop", 999.99, 5);
        Product product2 = new Product(102, "Smartphone", 499.99, 10);
        Product product3 = new Product(); // Default constructor

        // Displaying product details
        System.out.println("Product Details:");
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails(); // Default product details

        // Displaying the count of Product objects
        System.out.println("Total number of Product objects created: " + Product.getObjectCount());
    }
}
