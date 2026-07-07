import java.util.*;

public class Functions {

    // public static void printMyName(String name) {
    // System.out.println("Your name is " + name);
    // return;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your name: ");
    // String name = sc.nextLine();

    // printMyName(name); // function call
    // }

    // Q1. Write a function to print the sum of two numbers.

    // public static void sum(int a, int b) {
    // int sum = a + b;
    // System.out.print("Sum of " + a + " and " + b + " is " + sum);
    // return;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter first number: ");
    // int a = sc.nextInt();

    // System.out.print("Enter second number: ");
    // int b = sc.nextInt();

    // sum(a, b); // function call
    // }

    // Q2. Make a function to multiply two numbers and return the product.

    // public static void product(int a,int b){
    // int multiply = a * b;
    // System.out.print("Multiplication of " + a + " and " + b + " is " + multiply);
    // return;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter first number: ");
    // int a = sc.nextInt();

    // System.out.print("Enter second number: ");
    // int b = sc.nextInt();

    // product(a, b); // function call
    // }

    // Q3. Find the factorial of a number.

    // public static void factorial(int n) {
    // if (n < 0) {
    // System.out.print("Invalid number for factorial calculation");
    // return;
    // }

    // int fact = 1;
    // for (int i = n; i >= 1; i--) {
    // fact *= i;
    // }
    // System.out.println("factorial of " + n + " is " + fact);
    // return;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter a number: ");
    // int n = sc.nextInt();

    // factorial(n);
    // }

    // Q4. Make a function to check if a number is even or not.

    // public static void evenNum(int n) {
    // if (n % 2 == 0) {
    // System.out.print(n + " is an even number");
    // } else {
    // System.out.print(n + " is not an even number");
    // }
    // return;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter a number: ");
    // int n = sc.nextInt();

    // evenNum(n);
    // }

    // Q5. Make a function to check if a number is prime or not.

    // public static boolean isPrime(int n) {

    //     if (n <= 1) {
    //         return false;
    //     }
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter a number: ");
    //     int n = sc.nextInt();

    //     if (isPrime(n)) {
    //         System.out.println(n + " is a Prime Number.");
    //     } else {
    //         System.out.println(n + " is Not a Prime Number.");
    //     }
    // }
}