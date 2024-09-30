// Write a program to calculate perimeter and area of rectangle.
// (hint : area = length * breadth , perimeter=2*(length+breadth))

import java.util.Scanner;

public class area {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the cicral length");
        int l =scanner.nextInt();

        System.out.println("enter the cicral breath");
        int b =scanner.nextInt();

        int area=l*b;
        System.out.println("area="+area);
        
        int pari=2*(l+b);
        System.out.println(" pari="+pari);



    }

    
}
