import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = new StringBuilder(A).reverse().toString();
        if (A.equals(B)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
