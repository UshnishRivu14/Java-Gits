package function_exercise;
import java.util.*;
public class sumodd {
    public static int oddn(int n){
        int sum = 0, j =1;
        for (int i = 1; i<=n; i++) {
            if(j%2==1){
                sum = sum + j;
                j=j+2;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.printf("The sum of first %d odd numbers is %d",n,oddn(n));

        sc.close();
    }
}
