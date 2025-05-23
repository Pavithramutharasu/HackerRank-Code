import java.io.*;
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();
        int n = input.nextInt();
        for(int i =0;i<n;i++){
            int d = input.nextInt();
            List<Integer> elements = new ArrayList<>();
            for(int j =0;j<d;j++){
                elements.add(input.nextInt());
            }
            list.add(elements);
        }
        int a = input.nextInt();
        for(int i = 0;i<a;i++){
            int x = input.nextInt();
            int y = input.nextInt();
            try{
                System.out.println(list.get(x-1).get(y-1));
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
        
    }
}
