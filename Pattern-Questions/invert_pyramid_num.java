package Pattern_ques;
import java.util.*;

public class invert_pyramid_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("***PATTERN***");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
