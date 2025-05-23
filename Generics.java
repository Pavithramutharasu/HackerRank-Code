import java.io.*;
import java.util.*;

public class Generics {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Integer[] intarray = {1,2,3};
       String[] array = {"Hello","World"};
       Printer.display(intarray);
       Printer.display(array);
    }
}
class Printer{
    public static <T> void display(T[] array){
        for(T i : array){
            System.out.println(i);
        }
    }
}
