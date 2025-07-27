package function_exercise;
import java.util.*;

public class threenumavg {
    public static float numavg(float a, float b, float c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        float a = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        float b = sc.nextInt();

        System.out.println("Enter 3rd number: ");
        float c = sc.nextInt();
        sc.close();

        System.out.printf("The average of %f , %f and %f is %f",a,b,c,numavg(a, b, c));
    }
}
