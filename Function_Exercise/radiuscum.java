package function_exercise;
import java.util.*;

public class radiuscum {
    public static double circum(int r){
        double c = 2*3.14*r;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius: ");
        int r = sc.nextInt();

        System.out.printf("The Circumference of Circle with radius %d is %.2f cm",r,circum(r));
        sc.close();
    }
}
