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

        // PRACTICE

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}