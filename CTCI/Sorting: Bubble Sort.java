import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int temp = 0;
        int swapCount = 0;
        
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        
         for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
        }
        
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[length-1]);
    }
}
