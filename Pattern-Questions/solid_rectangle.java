package Pattern_ques;
import java.util.*;

public class solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows: ");
        int row = sc.nextInt();

        System.out.println("Enter no. of Columns: ");
        int col = sc.nextInt();

        System.out.println("PATTERN: ");
        for ( int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
