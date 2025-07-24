package advance_pattern;
import java.util.*;

public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows: ");
        int n = sc.nextInt();

        //1st part
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space -> 6, 4, 2, 0 that means -> 2*(n-i) -> 1st row: 2*(4-1) = 6 -> * 6space *
            for (int j = 2*(n-i); j >= 1; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd part-> reverse of 1st part
        for (int i = n; i >=1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 2*(n-i); j >= 1; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();
    }
}
