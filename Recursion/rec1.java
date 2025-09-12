package Recursion;

public class rec1 {

    public static void pnum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pnum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        pnum(n);
    }
}
