import java.io.*;
import java.util.*;

public class JavaHashset {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       input.nextLine();
       Set<String> pairs = new HashSet<>();
       for(int i = 0;i<n;i++){
        String[] name = input.nextLine().split(" ");
        Arrays.sort(name);
        
        String pair = name[0]+"#"+name[1];
        pairs.add(pair);
        
        System.out.println(pairs.size());
       }
    }
}
