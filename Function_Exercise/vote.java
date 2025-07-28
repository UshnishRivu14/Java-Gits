package function_exercise;
import java.util.*;

public class vote {
    public static void eligib(int age){
        if(age>=18){
            System.out.println("You are Eligible to Vote!!");
        }
        else{
            System.out.println("You are not Eligible to vote!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        eligib(age);

        sc.close();
    }
}
