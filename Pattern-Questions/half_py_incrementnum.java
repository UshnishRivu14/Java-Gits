package Pattern_ques;
import java.util.*;

public class half_py_incrementnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n  = sc.nextInt();

        int a = 1;
        System.out.println("****pattern****");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
