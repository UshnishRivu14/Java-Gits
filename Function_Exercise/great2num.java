package function_exercise;
import java.util.*;

public class great2num {

    public static int great(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.printf("The greater number is %d",great(a, b));

        sc.close();
    }
}
