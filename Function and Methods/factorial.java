package function_methods;
import java.util.*;

public class factorial {

    public static int facto(int n){
        if(n > 1){
            return n * facto(n - 1);
        } else {
            return 1;  // factorial of 0 and 1 is 1
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (0 to exit): ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Exiting... Goodbye!");
                break;
            } else if (n < 0) {
                System.out.println("Invalid Input!! Enter a number greater than or equal to 0.");
            } else {
                System.out.printf("The Factorial of %d is %d\n", n, facto(n));
            }
        }

        sc.close();
    }
}
