import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution extends Exception {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try { 
            int value = Integer.parseInt(S);
            System.out.println(value);
        } catch(NumberFormatException e){
            System.out.println("Bad String");
        }
        
        in.close();
    }
}