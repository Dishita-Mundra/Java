import java.util.*;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World\nJava");
        // System.out.print("Hello World\n");
        // System.out.print("Hello World");

        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");

        // VARIABLES
        // String name = "John";
        // int a = 25;
        // double price = 25.25;

        // int a = 10;
        // int b = 20;
        // int sum = a + b;
        // int mul = a * b;
        // System.out.println(sum);
        // System.out.print(mul);

        // INPUT
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // //nextInt()
        // //nextFloat()
        // //nextDouble()
        // //nextBoolean()
        // System.out.println(name);

        // PRACTICE
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("Enter another number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}