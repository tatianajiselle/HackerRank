// run time is linear o(n)

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int max = 0;

        while(n>0){
            if (n%2 == 1){
                count += 1;
                if (count > max){
                  max = count;
                }
            }else {
                count = 0;
            }
            n = n/2;
        }
        System.out.println(max);
    }
}
