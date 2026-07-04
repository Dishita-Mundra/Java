import java.util.*;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();

        // if (age >= 18) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not an adult.");
        // }


        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}