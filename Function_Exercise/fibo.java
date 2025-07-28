package function_exercise;
import java.util.*;

public class fibo {
    public static void fb(int n){
        if(n<=0){
        System.out.println("Enter a number greater than 1.");
        }

        System.out.println("The fibonaci series upto " + n + " series: ");
        int ft = 0, st = 1;
        for (int i = 1; i <= n; i++) {
            
            System.out.printf(ft + " ");

            int nt = ft + st; //sum of two term
            ft = st;// 1st num -> 2nd num
            st = nt; //2nd num -> next term shift
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of upto find fibonaci series: ");
        int n = sc.nextInt();

        fb(n);
        sc.close();
    }    
}
