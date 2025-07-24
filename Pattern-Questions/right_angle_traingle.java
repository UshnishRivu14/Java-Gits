package Pattern_ques;
import java.util.*;

public class right_angle_traingle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of Rows: ");
        int row = sc.nextInt();

        //System.out.println("Enter the number of Columns: ");
        //int col = sc.nextInt();
        System.out.println();
        System.out.println("Pattern: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");                
            }
            System.out.println();
        }
    }
}
