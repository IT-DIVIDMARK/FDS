/*public class SortNumbers {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide 5 numbers as command line arguments.");
            return;
        }

        int[] numbers = new int[5];

        try {
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide 5 integers.");
            return;
        }

        // Sort the numbers
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}*/
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1, matrix2;
        int choice;

        while (true) {
            System.out.println("Matrix Operations Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    matrix1 = getMatrix("Enter matrix 1: ");
                    matrix2 = getMatrix("Enter matrix 2: ");
                    int[][] result = addMatrices(matrix1, matrix2);
                    System.out.println("Result: ");
                    printMatrix(result);
                    break;
                case 2:
                    matrix1 = getMatrix("Enter matrix 1: ");
                    matrix2 = getMatrix("Enter matrix 2: ");
                    result = multiplyMatrices(matrix1, matrix2);
                    System.out.println("Result: ");
                    printMatrix(result);
                    break;
                case 3:
                    matrix1 = getMatrix("Enter matrix: ");
                    result = transposeMatrix(matrix1);
                    System.out.println("Result: ");
                    printMatrix(result);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int[][] getMatrix(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices cannot be added. Dimensions do not match.");
            return null;
        }

        int[][] result = new int[rows1][cols1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied. Dimensions do not match.");
            return null;
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}