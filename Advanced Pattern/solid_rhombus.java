package advance_pattern;
import java.util.*;

public class solid_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }

            //print * 
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
