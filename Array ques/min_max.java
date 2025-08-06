package array_ques;
import java.util.*;

public class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>min){
                max = arr[i];
            }
        }

        System.out.printf("The Maximum and Minimum numbers are %d and %d respectively.",max,min);
    }
}
