package function_methods;
import java.util.*;

public class sumtwonum {

    public static int s2num(int a, int b){
        return a +b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a= sc.nextInt();

        System.out.println("Enter Second number: ");
        int b= sc.nextInt();

        System.out.printf("The sum of two numbers %d and %d is %d", a, b, s2num(a, b));
        sc.close();
    }    
}
