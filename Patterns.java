import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PATTERN 1 - solid rectangle

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // System.out.print("Enter number of columns: ");
        // int cols = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= cols; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // PATTERN 2 - hollow rectangle

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // System.out.print("Enter number of columns: ");
        // int cols = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= cols; j++) {
        // if (i == 1 || i == rows || j == 1 || j == cols) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // PATTERN 3 - half pyramid

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // for (int i = 1 ; i <= rows; i++){
        // for (int j = 1; j <= i; j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // PATTERN 4 - inverted half pyramid

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // for (int i = rows; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // PATTERN 5 - half pyramid after 180 degree rotation

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= rows - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // PATTERN 6 - half pyramid using numbers

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // PATTERN 7 - inverted half pyramid using numbers

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= rows - i + 1; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // PATTERN 8 - Floyd's triangle

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // int number = 1;
        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + " ");
        // number++;
        // }
        // System.out.println();
        // }

        // PATTERN 9 - 0-1 triangle

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }

        // PATTERN 10 - butterfly pattern

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // // upper half
        // for (int i = 1; i <= rows; i++) {
        // // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // // spaces
        // int spaces = 2 * (rows - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // lower half
        // for (int i = rows; i >= 1; i--) {
        // // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // // spaces
        // int spaces = 2 * (rows - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // PATTERN 11 - solid rhombus

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        //     // spaces
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for (int j = 1; j <= rows; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // PATTERN 12 - Number pyramid

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        //     // spaces
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // numbers
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }


        // PATTERN 13 - Palindromic pattern

        // System.out.print("Enter number of rows: ");
        // int rows = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        //     // spaces
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print("  ");
        //     }
        //     // 1st half
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j + " ");
        //     }
        //     // 2nd half
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
    }
}