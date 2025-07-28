package function_exercise;
import java.util.*;

public class commongcd {
    public static int gcd(int n1,int n2){
        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        return Math.abs(n1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.printf("The Greatest Common Divisor of %d and %d is %d",a,b,gcd(a, b));
        sc.close();

    }
}
