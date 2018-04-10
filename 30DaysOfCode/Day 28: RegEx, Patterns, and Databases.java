import java.io.*;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String pattern = ".+@gmail\\.com$";
        
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m;
        String name;
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            name = sc.next();
            m = r.matcher(sc.next());
            
            if (m.find()) 
                list.add(name);
        }
        
        Collections.sort(list);
        
        for(String s : list){
            System.out.println(s);
        }
    }
}