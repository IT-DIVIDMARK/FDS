/*public class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;

    private static int objectCount = 0;


    public Employee() {
        this.id = 0;
        this.name = "";
        this.deptName = "";
        this.salary = 0.0;
        objectCount++;
    }


    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++;
    }


    public static int getObjectCount() {
        return objectCount;
    }


    public void displayDetails() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.deptName);
        System.out.println("Salary: $" + this.salary);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "John Doe", "IT", 50000.0);
        System.out.println("Object count: " + Employee.getObjectCount());
        emp1.displayDetails();

        Employee emp2 = new Employee(2, "Jane Smith", "HR", 60000.0);
        System.out.println("Object count: " + Employee.getObjectCount());
        emp2.displayDetails();

        Employee emp3 = new Employee(3, "Mike Johnson", "Finance", 55000.0);
        System.out.println("Object count: " + Employee.getObjectCount());
        emp3.displayDetails();
    }
}*/

interface Serializable {

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


    public Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        objectCount++;
    }


    public void displayDetails() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product Cost: $" + this.productCost);
        System.out.println("Product Quantity: " + this.productQuantity);
        System.out.println("-----------------------------");
    }


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
