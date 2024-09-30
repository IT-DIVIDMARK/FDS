
// Define a class MyNumber having one private int data member. Write a default
// constructor to initialize it to 0 and another constructor to initialize it to a value (Use
// this). Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in
// main. Use command line arguments to pass a value to the object(Hint : convert string
// argument to integer) and perform the above tests. Provide javadoc comments for all
// constructors and methods and generate the html help file.
public class MyNumber {
    private int number;

   
    public MyNumber() {
        this.number = 0;
    }

   
    public MyNumber(int number) {
        this.number = number;
    }

   
    public boolean isNegative() {
        return this.number < 0;
    }

   
    public boolean isPositive() {
        return this.number > 0;
    }

    
    public boolean isZero() {
        return this.number == 0;
    }

    
    public boolean isOdd() {
        return this.number % 2 != 0;
    }
    public boolean isEven() {
        return this.number % 2 == 0;
    }

    public static void main(String[] args) {
       
        if (args.length > 0) {
            try {
                
                int value = Integer.parseInt(args[0]);

               
                MyNumber myNum = new MyNumber(value);

               
                System.out.println("Number: " + value);
                System.out.println("isNegative: " + myNum.isNegative());
                System.out.println("isPositive: " + myNum.isPositive());
                System.out.println("isZero: " + myNum.isZero());
                System.out.println("isOdd: " + myNum.isOdd());
                System.out.println("isEven: " + myNum.isEven());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter a valid integer.");
            }
        } else {
            System.out.println("Please provide a number as a command line argument.");
        }
    }
}
