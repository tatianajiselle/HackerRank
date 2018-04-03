import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        Integer count = 0; // count of frequency for each number
        Integer modeVal = 999999; // current value of the mode
        Integer currentModeCount = 0; // current highest mode count
        Integer sum = 0;
        
        // find the mode + save values
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        double[] arr = new double[n];
        
        for (int i=0; i < n; i++){
            
            Integer num =  sc.nextInt();
            count = hashMap.containsKey(num) ? hashMap.get(num) : 0;
            hashMap.put(num,count+1);

            if (count+1 >= currentModeCount && num <= modeVal){
                modeVal = num;
            }
            arr[i]= (double) num;
            sum += num;
        }

        // find the mean
        double mean = (double) sum /(n);

        double median = 0;
        
        // find the median
        Arrays.sort(arr);
        n = arr.length;
        if ((n % 2) == 0) // if the length is odd numbered, take median
            median = ( arr[((n/2)-1)] + arr[n/2])/2; 
            else{
                median = (arr[n/2]);
            }
        
        // print the mean, median, mode
        System.out.println(mean);
        System.out.println(median);
        System.out.println(modeVal);
    }

}