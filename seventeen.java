import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
import java.util.Scanner;

interface Marker {
}

class Product implements Marker {
    int productId;
    String productName;
    double productCost;
    int productQuantity;

    Product() {
        this.productId = 0;
        this.productName = "";
        this.productCost = 0.0;
        this.productQuantity = 0;
    }

    Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: " + productCost);
        System.out.println("Product Quantity: " + productQuantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter product details for product " + (i + 1));
            System.out.print("Enter product ID: ");
            int productId = sc.nextInt();
            System.out.print("Enter product name: ");
            String productName = sc.next();
            System.out.print("Enter product cost: ");
            double productCost = sc.nextDouble();
            System.out.print("Enter product quantity: ");
            int productQuantity = sc.nextInt();

            products[i] = new Product(productId, productName, productCost, productQuantity);
        }

        System.out.println("Product Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Product " + (i + 1));
            products[i].display();
            System.out.println();
        }

        System.out.println("Object Count: " + n);
    }
}
*/