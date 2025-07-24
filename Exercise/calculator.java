package Exercise;
import java.util.*;

class calculator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        
        System.out.println("Enter an operator(+,-,*,/,%) : ");
        String s = sc.next();
        
        switch (s){
            case "+":
                System.out.printf("%d + %d = %d",a,b,a+b);
                break;

            case "-":
                System.out.printf("%d - %d = %d",a,b,a-b);
                break;

            case "*":
                System.out.printf("%d * %d = %d",a,b,a*b);
                break;

            case "/":
                if (b!=0){
                    System.out.printf("%d / %d = %d",a,b,a/b);
                }
                else{
                    System.out.println("ERROR: Division by Zero is not allowed!");
                }
                break;

            case "%":
                if(b!=0){
                    System.out.printf("%d %% %d = %d",a,b,a%b);
                }
                else{
                    System.out.println("% by 0 is not Allowed!!");
                }
                break;
            default:
                System.out.println("ERROR: Entered a wrong operator!!");
        }


        sc.close();
    }
}
