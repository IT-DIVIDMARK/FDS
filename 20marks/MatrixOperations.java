// Write a menu driven program to perform the following operations on multidimensional
// array ie matrix :
// [20]
// i. Addition
// ii. Multiplication
// iii. Transpose of any matrix.
// iv. Exit
import java.util.Scanner;

public class MatrixOperations {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Matrix Operations Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    matrixAddition();
                    break;
                case 2:
                    matrixMultiplication();
                    break;
                case 3:
                    matrixTranspose();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }

    // Method for Matrix Addition
    private static void matrixAddition() {
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");
        inputMatrix(matrixA);

        System.out.println("Enter elements of Matrix B:");
        inputMatrix(matrixB);

        // Adding matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Result of Addition:");
        printMatrix(sumMatrix);
    }

    // Method for Matrix Multiplication
    private static void matrixMultiplication() {
        System.out.print("Enter the number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix A (and rows for Matrix B): ");
        int colsA = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix B: ");
        int colsB = scanner.nextInt();

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[colsA][colsB];
        int[][] productMatrix = new int[rowsA][colsB];

        System.out.println("Enter elements of Matrix A:");
        inputMatrix(matrixA);

        System.out.println("Enter elements of Matrix B:");
        inputMatrix(matrixB);

        // Multiplying matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                productMatrix[i][j] = 0; // Initialize the product
                for (int k = 0; k < colsA; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Result of Multiplication:");
        printMatrix(productMatrix);
    }

    // Method for Matrix Transpose
    private static void matrixTranspose() {
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transposedMatrix = new int[cols][rows];

        System.out.println("Enter elements of the Matrix:");
        inputMatrix(matrix);

        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

    // Method to input a matrix
    private static void inputMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
