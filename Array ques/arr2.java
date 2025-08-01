package array_ques;
import java.util.*;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Marks: ");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            System.out.println("Marks: " + arr[i]);
        }

        sc.close();
    }    
}
