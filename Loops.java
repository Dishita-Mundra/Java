import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // }

        // int i = 0;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }

        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 10);

        // int i = 12;
        // while (i < 11) {
        // System.out.println("Hello");
        // }

        // do {
        // System.out.println("Hello");
        // } while (i < 11);

        // PRACTICE 1

        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum += i;
        // }
        // System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {
        // int mul = i * n;
        // System.out.println(mul);
        // }

        // PRACTICE 2

        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        // for (int i = 0; i <= n; i++) {
        // if (i %2==0) {
        // System.out.println(i);
        // }
        // }


        // PRACTICE 3

        // System.out.print("Enter a number(1/0): ");
        // int n = sc.nextInt();

        // do {
        //     if (n == 1) {
        //         System.out.print("Enter marks:");
        //         int marks = sc.nextInt();

        //         if (marks >= 90) {
        //             System.out.println("This is Good");
        //         } else if (marks >= 60) {
        //             System.out.println("This is also Good");
        //         } else if (marks >= 0) {
        //             System.out.println("This is Good as well");
        //         } else {
        //             System.out.println("Invalid Marks");
        //         }
        //     } else if (n != 0) {
        //         System.out.println("Invalid");
        //     }
        // } while (n != 0);

        // sc.close();


        // PRACTICE 4

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}