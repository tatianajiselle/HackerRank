import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        long max = arr[0];
        long min = arr[0];
        long sum = arr[0];
        
        for(int i = 1; i < 5; i++){
             if (arr[i] < min){
                 min = arr[i];
             }   
             if(arr[i] > max){
                 max = arr[i];
             }
            sum += arr[i];
        }
        
        long totalMin = sum - max;
        long totalMax = sum - min;
        
        System.out.printf(totalMin + " " + totalMax);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
