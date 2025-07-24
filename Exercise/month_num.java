package Exercise;
import java.util.*;

class month_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.printf("The table of %d: \n",n);
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
        sc.close();
    }
}
