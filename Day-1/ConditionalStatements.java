import java.util.*;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // IF-ELSE

        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();

        // if (age >= 18) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not an adult.");
        // }


        // System.out.println("Enter any number: ");
        // int n = sc.nextInt();

        // if (n % 2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }


        // ELSE-IF

        // System.out.print("Enter any number: ");
        // int a = sc.nextInt();

        // System.out.print("Enter another number: ");
        // int b = sc.nextInt();

        // if (a == b) {
        //     System.out.println("Equal");
        // } else if (a > b) {
        //     System.out.println("a is greater than b");
        // } else {
        //     System.out.println("b is greater than a");
        // }


        // SWITCH BREAK

        // System.out.print("Press a button(1/2/3): ");
        // int button = sc.nextInt();

        // switch(button) {
        //     case 1:
        //         System.out.print("Hello");
        //         break;
        //     case 2:
        //         System.out.print("Namaste");
        //         break;
        //     case 3:
        //         System.out.print("Bonjour");
        //         break;
        //     default:
        //         System.out.print("Invalid button");
        // }


        // PRACTICE

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("Enter another number: ");
        int b = sc.nextInt();

        System.out.print("Enter a button(1/2/3/4/5): ");
        int button = sc.nextInt();

        switch(button) {
            case 1:
                System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
                break;
            case 2:
                System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
                break;
            case 3:
                System.out.println("The product of " + a + " and " + b + " is " + (a * b));
                break;
            case 4:
                System.out.println("The quotient of " + a + " and " + b + " is " + (a / b));
                break;
            case 5:
                System.out.println("The remainder of " + a + " and " + b + " is " + (a % b));
                break;
            default:
                System.out.print("Invalid button");
        }
    }
}