import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
          HashMap<Integer,Integer> birdFrequencies = new HashMap<Integer,Integer>();
            Integer count = 0;
            Integer max = 0;
            Integer id = 0;

            for (Integer bird : ar) { // add/increase bird count per sighting
                count = birdFrequencies.containsKey(bird) ? birdFrequencies.get(bird) : 0;
                birdFrequencies.put(bird, (count + 1));

                if ((count + 1) == max) { //check if id is highest if equal
                     if (id > bird) {
                        id = bird;
                     }
                }
                if (count + 1 > max) { //if new highest count save id
                    max = count + 1;
                    id = bird;
                }
            }

            return id;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}