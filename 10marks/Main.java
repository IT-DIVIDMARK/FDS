class Employee {
    
    private static int objectCount = 0;
    private int id;
    private String name;
    private String deptName;
    private double salary;

    // Default constructor
    public Employee() {
        this(0, "", "", 0.0); // Calls the parameterized constructor with default values
    }

    // Parameterized constructor
    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++;  
    }

    // Static method to return the number of created objects
    public static int getObjectCount() {
        return objectCount;
    }

    // Method to display the employee details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + deptName + ", Salary: " + salary);
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "Engineering", 50000);
        System.out.println("Object Count after e1: " + Employee.getObjectCount());
        e1.display();
    }
}
