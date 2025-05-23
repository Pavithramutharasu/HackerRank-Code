import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.close();
        Locale local = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(local);
        String indiaa = india.format(amount);
        
       
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + indiaa);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
