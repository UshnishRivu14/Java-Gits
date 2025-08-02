package array_ques;
import java.util.*;

public class transpose_matrix {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of Rows: ");
    int r = sc.nextInt();

    System.out.println("Enter the Number of Columns: ");
    int c = sc.nextInt();

    int[][] matrix = new int[r][c];

    System.out.println("Enter the elements: ");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }

    System.out.println("The Transpose is: ");

    for (int j = 0; j < c; j++) {
        for (int i = 0; i < r; i++) {
            System.out.print(matrix[i][j] + " ");
        }
    }

    sc.close();
    }
}
