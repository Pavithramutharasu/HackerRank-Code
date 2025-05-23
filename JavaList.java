import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            list.add(input.nextInt());
        }
        
        int a = input.nextInt();
        input.nextLine();
        
        for(int i =0;i<a;i++){
            String s = input.nextLine();
           
            
            if(s.equals("Insert")){
                String[] b = input.nextLine().split(" ");
                int x = Integer.parseInt(b[0]);
                int y = Integer.parseInt(b[1]);
                list.add(x,y);
            }
            else if(s.equals("Delete")){
                int x = Integer.parseInt(input.nextLine());
                list.remove(x);
            }
        }
        for(int j : list){
            System.out.print(j+" ");
        }
    }
}
