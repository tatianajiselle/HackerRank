import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] arr_a = {a0, a1, a2};
        int[] arr_b = {b0, b1, b2};
        int alice = 0;
        int bob = 0;
        
        for (int i=0; i < 3; i++){
            if (arr_a[i] > arr_b[i]){
                alice += 1;
            }
            if (arr_a[i] < arr_b[i]){
                bob += 1;
            }
        }
        int[] result = {alice,bob};
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}