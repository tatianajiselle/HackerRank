import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for (int x=0; x<k;x++){
        // assign index 0 to temp
            int temp = a[0];
            for (int i = 0; i < n-1; i++){   
            // move all values forward one
                a[i] = a[i+1];
            //assign temp to k    
            }
            a[n-1] = temp;
        }
        
        for (int i : a)
            System.out.print(i + " ");
    }
}
