package function_exercise;
import java.util.*;

public class powfunc {
    public static int pw(int x, int n){
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s*x;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.printf("The value of %d to the power %d is %d",x,n,pw(x,n));

        sc.close();
    }    
}
