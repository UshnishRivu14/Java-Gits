package string;
import java.util.*;

public class string_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();

        System.out.println("Enter another string: ");
        String s2 = sc.nextLine();

        //concatenate string
        System.out.println(s1 + " "+ s2);

        //string length
        System.out.println(s1.length());

        //print characters
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        sc.close();
    }
}
