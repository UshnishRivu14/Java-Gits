package string_builder;
import java.util.*;

public class strb1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ushnish");
        System.out.println(sb);

        //Check character at a index
        System.out.println(sb.charAt(4));

        //change a character in a string
        sb.setCharAt(0, 'C');
        System.out.println(sb);

        //Adding a character at any position in a string
        sb.insert(1, 'u');
        System.out.println(sb);

        //Deleting a character
        sb.delete(0, 1);
        System.out.println(sb);

        sb.append(" sarkar");
        System.out.println(sb);
    }
}
