package Pattern_ques;
import java.util.*;

public class inverted_right_traingle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Rows: ");
        int row = sc.nextInt();

        for (int i = row; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
