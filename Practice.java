import java.util.*;

public class Practice {

    // Q1. Enter 3 numbers from the user & make a function to print their average.

    // public static void average(int a, int b, int c) {
    // float avg = (float) (a + b + c) / 3;
    // System.out.print("Anverage of given numbers is " + avg);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter first number: ");
    // int a = sc.nextInt();

    // System.out.print("Enter second number: ");
    // int b = sc.nextInt();

    // System.out.print("Enter third number: ");
    // int c = sc.nextInt();

    // average(a, b, c);

    // sc.close();
    // }

    // Q2. Write a function to print the sum of all odd numbers from 1 to n.

    // public static void oddNum(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // if (i % 2 != 0) {
    // sum += i;
    // }
    // }
    // System.out.print("Sum of all odd numbers from 1 to " + n + " natural numbers
    // is " + sum);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter n: ");
    // int n = sc.nextInt();

    // oddNum(n);

    // sc.close();
    // }

    // Q3. Write a function which takes in 2 numbers and returns the greater of
    // those two.

    public static void greaterNum(int a, int b) {
        if (a > b) {
            System.out.print("a is greater");
        } else if (a < b) {
            System.out.print("b is greater");
        } else {
            System.out.print("a and b are equal");
        }
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        greaterNum(a, b);

        sc.close();
    }
}