import java.io.*;
import java.util.*;

public class JavaStaticInitializerBlock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            int b = input.nextInt();
            int h = input.nextInt();
            if(b<=0 || h<=0){
               throw new Exception("Breadth and height must be positive");
            }
            else{
                int area = b*h;
                System.out.println(area);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
