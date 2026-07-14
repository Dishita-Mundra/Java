import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // System.out.print("Enter number of columns: ");
        // int cols = sc.nextInt();

        // int[][] numbers = new int[rows][cols];

        // // input
        // // rows
        // for (int i = 0; i < rows; i++) {
        // // columns
        // for (int j = 0; j < cols; j++) {
        // System.out.print("Enter element of index " + "(" + i + "," + j + "): ");
        // numbers[i][j] = sc.nextInt();
        // }
        // }

        // //output
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Q. Take a matrix as input form the user. Search for a given number x and
        // print the indices at which it occurs.

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // System.out.print("Enter number of columns: ");
        // int cols = sc.nextInt();

        // int[][] numbers = new int[rows][cols];

        // // input
        // // rows
        // for (int i = 0; i < rows; i++) {
        // // columns
        // for (int j = 0; j < cols; j++) {
        // System.out.print("Enter element of index " + "(" + i + "," + j + "): ");
        // numbers[i][j] = sc.nextInt();
        // }
        // }

        // System.out.print("Enter x: ");
        // int x = sc.nextInt();

        // // output
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {

        // //compare with x
        // if (numbers[i][j] == x) {
        // System.out.println("x found at location: (" + i + "," + j + ")");
        // }
        // }
        // }

        // Q. Print spiral order of a matrix.

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number of rows: ");
        // int n = sc.nextInt();

        // System.out.print("Enter number of columns: ");
        // int m = sc.nextInt();

        // int[][] matrix = new int[n][m];

        // // input
        // // rows
        // for (int i = 0; i < n; i++) {
        // // columns
        // for (int j = 0; j < m; j++) {
        // System.out.print("Enter element of index " + "(" + i + "," + j + "): ");
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // System.out.println("The Spiral Order Matrix is : ");
        // int rowStart = 0;
        // int rowEnd = n - 1;
        // int colStart = 0;
        // int colEnd = m - 1;

        // // To print spiral order matrix
        // while (rowStart <= rowEnd && colStart <= colEnd) {
        // // 1
        // for (int col = colStart; col <= colEnd; col++) {
        // System.out.print(matrix[rowStart][col] + " ");
        // }
        // rowStart++;
        // // 2
        // for (int row = rowStart; row <= rowEnd; row++) {
        // System.out.print(matrix[row][colEnd] + " ");
        // }
        // colEnd--;

        // // 3
        // for (int col = colEnd; col >= colStart; col--) {
        // System.out.print(matrix[rowEnd][col] + " ");
        // }
        // rowEnd--;

        // // 4
        // for (int row = rowEnd; row >= rowStart; row--) {
        // System.out.print(matrix[row][colStart] + " ");
        // }
        // colStart++;

        // System.out.println();
        // }

        // Q. For a given matrix of N x M, print its transpose.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] numbers = new int[n][m];

        // input
        // rows
        for (int i = 0; i < n; i++) {
            // columns
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element of index " + "(" + i + "," + j + "): ");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The transpose is : ");
        // To print transpose
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i][j] + " ");
            }
        System.out.println();
        }
    }
}