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


        // Q. Take a matrix as input form the user. Search for a given number x and print the indices at which it occurs.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element of index " + "(" + i + "," + j + "): ");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                //compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at location: (" + i + "," + j + ")");
                }
            }
        }
    }
}
