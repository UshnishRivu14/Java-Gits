package array_ques;
import java.util.*;

public class check_ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAsc = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] >arr[i+1]){
                isAsc = false;
            }
        }
        
        if(isAsc){
            System.out.println("The array is sorted in ascending order!");
        }else{
            System.out.println("The array is not sorted in ascending order!!");
        }
        sc.close();
    }    
}
