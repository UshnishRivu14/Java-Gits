package string;
import java.util.*;

public class string_manipulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s1 = "Tony";
        String s2 = "Stark";

        if(s1.compareTo(s2)==0){
            System.out.println("Strings are equal!");
        }else{
            System.out.println("Strings are not equal!");
        }

        sc.close();

        String sen = "I Really want to have a partner!";

        //substring takes a beginning index and an ending index but only beginning index can do
        System.out.println(sen.substring(5));
    }    
}
