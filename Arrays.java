import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // // int[] marks = new int[3];
        // int marks[] = new int[3];
        // marks[0] = 97; // phy
        // marks[1] = 98; // chem
        // marks[2] = 95; // eng
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);

        // int marks[] = {97, 98, 95};

        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size of array: ");
        // int size = sc.nextInt();

        // int numbers[] = new int[size];

        // //input
        // for (int i = 0; i < size; i++) {
        // System.out.print("Enter an element: ");
        // numbers[i] = sc.nextInt();
        // }

        // //output
        // for (int i = 0; i < size; i++) {
        // System.out.println(numbers[i]);
        // }

        // Q. Take an array as input from the user. Search for a given number x and
        // print the index at which it occurs.

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter an element: ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
}