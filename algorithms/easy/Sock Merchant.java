import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer,Integer> colorFrequencies = new HashMap<Integer,Integer>();
        Integer count = 0;
        int totalPairs = 0;
        
         for (Integer sock : ar) {
            count = colorFrequencies.containsKey(sock) ? colorFrequencies.get(sock) : 0;
            colorFrequencies.put(sock, (count + 1));
             
            if ((count + 1)%2 == 0){
                totalPairs += 1;
            }
         }
        return totalPairs;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}