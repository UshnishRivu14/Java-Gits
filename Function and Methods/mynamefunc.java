package function_methods;
import java.util.*;

public class mynamefunc {

    public static void printname(String name){
        System.out.println("My name is "+name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        printname(name);
        sc.close();
    }
}
