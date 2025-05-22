import java.io.*;
import java.util.*;
import java.util.regex.*;

public class UsernameValidation {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = Integer.parseInt(input.nextLine());
       String r = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
       
       while(n-- >0){
        String username = input.nextLine();
        if(username.matches(r)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
       }
      
    }
}
