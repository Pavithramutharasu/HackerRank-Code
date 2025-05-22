import java.io.*;
import java.util.*;

public class JavaStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        int sum = A.length() + B.length();
        System.out.println(sum);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String a = A.substring(0,1).toUpperCase()+A.substring(1);
        String b = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(a + " " + b);
    }
}
