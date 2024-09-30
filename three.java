/*import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Array in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}*/
// Marker interface
interface Serializable {
    // No methods or variables, just a marker
}

class Product implements Serializable {
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;

    private static int objectCount = 0;

    // Default constructor
    public Product() {
        this.productId = 0;
        this.productName = "";
        this.productCost = 0.0;
        this.productQuantity = 0;
        objectCount++;
    }

    // Parameterized constructor
    public Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        objectCount++;
    }

    // Method to display object contents
    public void displayDetails() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product Cost: $" + this.productCost);
        System.out.println("Product Quantity: " + this.productQuantity);
        System.out.println("-----------------------------");
    }

    // Static method to get object count
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Product product1 = new Product(1, "Apple iPhone", 999.99, 10);
        System.out.println("Object count: " + Product.getObjectCount());
        product1.displayDetails();

        Product product2 = new Product(2, "Samsung TV", 1299.99, 5);
        System.out.println("Object count: " + Product.getObjectCount());
        product2.displayDetails();

        Product product3 = new Product(3, "Nike Shoes", 79.99, 20);
        System.out.println("Object count: " + Product.getObjectCount());
        product3.displayDetails();
    }
}