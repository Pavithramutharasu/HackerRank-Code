import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String s = input.nextLine();
       
       String[] tokens = s.trim().split("[^A-Za-z]+");
       
       if(s.trim().isEmpty()){
        System.out.println("0");
       }
       else{
        System.out.println(tokens.length);
        for(String i : tokens){
            System.out.println(i);
        }
       }
    }
}
