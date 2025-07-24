package Pattern_ques;
import java.util.*;

public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Rows: ");
        int row = sc.nextInt();

        System.out.println("Enter no. of Columns: ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if(i == 0 || j==0 || i == row-1 || j== col-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }

            System.out.println();
        }
        sc.close();
    }
}
