package function_exercise;
import java.util.*;

public class typnum {
    public static void tn(int num){
        if(num>0){
            System.out.println("Positive Number!");
        }
        else if(num<0){
            System.out.println("Negative Number!");
        }
        else if(num ==0){
            System.out.println("IT is Zero!!");
        }
        else{
            System.out.println("Invlaid INPUT!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        tn(num);

        sc.close();
    }    
}
