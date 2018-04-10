// runtime is o(4n) = o(n) = space complexity

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int solve(String ransom[], String magazine[]){
        Hashtable<String,Integer> freq = new Hashtable<>();
        
        Integer count = 0;
       
        for (String s : magazine){
            count = freq.containsKey(s) ? freq.get(s) : 0;
            freq.put(s, count + 1);
        }
        
        for (String s : ransom){
            if (freq.containsKey(s)){
                count = freq.get(s);
                if (count == 0){
                    System.out.println("No");
                    return 0;
                }
                freq.put(s, count - 1);
            }
        }
        System.out.println("Yes");
        return 0;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        solve(ransom, magazine);
    }
}