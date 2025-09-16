package Recursion;

public class factorial4 {
    public static int fa(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int fn1 = fa(n-1);
        int fn = n * fn1;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("The factorial of %d is %d",n,fa(n));
    }
}
