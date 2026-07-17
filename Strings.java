import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter name: ");
        // String name = sc.nextLine();

        // System.out.print("Hello " + name);

        // Concatenation

        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " + lastName;

        // System.out.println(fullName);
        // System.out.println("Length of fullName: " + fullName.length());

        // // charAt
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // Compare Strings

        // String name1 = "Tony";
        // String name2 = "Tony";

        // 1. s1 > s2: return +ve value
        // 2. s1 == s2: return 0
        // 3. s1 < s2: return -ve value

        // if (name1.compareTo(name2) == 0 ) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // if (name1 == name2 ) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // WRONG METHOD
        // if (new String("Tony") == new String("Tony")) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // Getting Substring

        // String sentence = "My name is Dishita";
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);

        // Strings are Immutable - we directly can't change strings, we need to make new
        // string to change the string

        // Q. Take an array of Strings input from the user & find the cumulative
        // (combined) length of all those strings.

        // System.out.print("Enter size of array: ");
        // int size = sc.nextInt();

        // String array[] = new String[size];

        // int totalLen = 0;

        // for (int i = 0; i < size; i++) {

        // System.out.print("Enter string: ");
        // array[i] = sc.next();

        // totalLen += array[i].length();
        // }
        // System.out.println("Combined length of all strings: " + totalLen);

        // Q. Input a string from the user. Create a new string called ‘result’ in which
        // you will replace the letter ‘e’ in the original string with letter ‘i’.
        // Example :
        // original = “eabcdef’ ; result = “iabcdif”
        // Original = “xyz” ; result = “xyz”

        // System.out.print("Enter a string: ");
        // String string = sc.nextLine();

        // System.out.println("Initial string: " + string);

        // String result = string.replace("e", "i");

        // System.out.println("Updated string: " + result);

        // Q. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        // Example :
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”

        System.out.print("Enter email (username@gmail.com): ");
        String email = sc.nextLine();

        System.out.println("Email of user is: " + email);

        int index = email.indexOf('@');

        String username = email.substring(0, index);
        System.out.println("Username is: " + username);
    }
}