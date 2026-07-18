import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println("Original String: " + sb);

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // set char at index 0
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // insert
        sb.insert(2, "n");
        System.out.println("Updated String: " + sb);
    }
}