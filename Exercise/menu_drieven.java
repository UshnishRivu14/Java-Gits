package Exercise;
import java.util.*;

class menu_driven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, marks;
        do{
            System.out.println("Enter 0 or 1: ");
            a = sc.nextInt();
            if(a==1){
                System.out.println("Enter Marks (0-100): ");
                marks = sc.nextInt();

                if(marks >= 90 && marks <=100){
                    System.out.println("This is Good Marks!!");
                }
                else if(marks <90 && marks >=60){
                    System.out.println("This is also Good Marks!!");
                }
                else if(marks <60 && marks >=0){
                    System.out.println("This is Good as well!!");
                }
                else{
                    System.out.println("ERROR: Enter value between (0-100).");
                }
            }
        }while(a!=0);
        sc.close();
    }
}