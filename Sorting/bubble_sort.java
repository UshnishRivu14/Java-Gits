package sorting;
import java.util.*;

public class bubble_sort {

    public static void swapp(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before Sort: " + Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                swapp(arr, j, j+1);
            }
            }
        }

        System.out.println("Array After Sorte: " + Arrays.toString(arr));
        sc.close();
    }
}
