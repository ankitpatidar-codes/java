import java.util.*;

public class Pattern {

    static void main(String[] args) {

        int n = 4;
        int m = 5;

//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter the number ");
//
//        System.out.println("Enter the number a ");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the number b ");
//        int b = sc.nextInt();

//        // outer loop
//        for(int i = 1; i<=n;i++){
//
//            // Inner loop
//            for(int j = 1; j<=m; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// now for Hollo Ractangle
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}














