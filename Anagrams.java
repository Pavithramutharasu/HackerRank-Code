import java.io.*;
import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        
        a = a.replace("\\s","").toLowerCase();
        b = b.replace("\\s","").toLowerCase();
        
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        
        Arrays.sort(c);
        Arrays.sort(d);
        
        if(Arrays.equals(c,d)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
