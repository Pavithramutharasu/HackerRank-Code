import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndoffile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i =1;
        while(input.hasNextLine()){
            String s = input.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}
