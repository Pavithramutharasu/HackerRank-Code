import java.io.*;
import java.util.*;

public class Bitset {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        for(int i = 0; i<m; i++){
            String s = input.next();
            int a = input.nextInt();
            int b = input.nextInt();
            
            BitSet first = (a==1)?b1:b2;
            BitSet second = (b==1)?b1:b2;
            
            switch(s){
                case "AND":
                first.and(second);
                break;
                
                case "OR":
                first.or(second);
                break;
                
                case "XOR":
                first.xor(second);
                break;
                
                case "SET":
                first.set(b);
                break;
                
                case "FLIP":
                first.flip(b);
                break;
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
    }
}
