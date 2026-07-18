import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Dishita");
        // System.out.println("Original String: " + sb);

        // // CHAR AT
        // System.out.println(sb.charAt(0));

        // // SET CHAR AT
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // INSERT
        // sb.insert(2, "n");
        // System.out.println("Updated String: " + sb);

        // DELETE
        // sb.delete(4, 7);
        // System.out.println("Updated String: " + sb);

        // StringBuilder sb = new StringBuilder("h");
        // System.out.println("Original String: " + sb);

        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println("New String: " + sb);
        // System.out.println("Length of new string: " + sb.length());

        // REVERSE THE STRING
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Original String: " + sb);

        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("Reverse string: " + sb);
    }
}