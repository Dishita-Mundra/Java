// import java.util.*;

// 1.
// public class patterns {
//     public static void main(String[] args) {
//         //outer loop for rows
//         for (int i=1;i<=4;i++){
//             //inner loop for columns
//             for (int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//     }
// }


//2.
// public class patterns {
//     public static void main(String[] args) {
//         //outer loop for rows
//         for (int i=1;i<=4;i++){
//             //inner loop for columns
//             for (int j=1;j<=5;j++){
//                 //cell-->(i,j)
//                 if(i==1 || j==1 || i==4 || j==5){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//     }
// }

//3.
public class patterns{
    public static void main(String[] args) {
        int n=4;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}