import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class JavaBigInteger {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String n = input.next();
       String m = input.next();
       BigInteger a = new BigInteger(n);
       BigInteger b = new BigInteger(m);
       
       System.out.println(a.add(b));
       System.out.println(a.multiply(b));
    }
}
