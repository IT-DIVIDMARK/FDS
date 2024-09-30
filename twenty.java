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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the first file: ");
        String file1 = sc.next();
        System.out.print("Enter the name of the second file: ");
        String file2 = sc.next();

        try {
            File f1 = new File(file1);
            File f2 = new File(file2);

            Scanner scanner = new Scanner(f1);
            FileWriter writer = new FileWriter(f2);

            while (scanner.hasNextLine()) {
                writer.write(scanner.nextLine() + "\n");
            }
            writer.write("end of file\n");
            scanner.close();
            writer.close();

            System.out.println("Contents copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
    }
}
*/