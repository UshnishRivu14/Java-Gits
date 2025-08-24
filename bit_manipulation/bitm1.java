package bit_manipulation;
import java.util.*;

public class bitm1 {
    public static void main(String[] args) {
        int n = 7; //00111
        int pos = 3;
        int bitmask = 1<<pos;

        if((bitmask & n) == 0){
            System.out.println("The Bit is Zero!");
        }
        else{
            System.out.println("The Bit is One!!");
        }
    }
}
