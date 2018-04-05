import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int aDay = sc.nextInt();
        int aMonth = sc.nextInt();
        int aYear = sc.nextInt();
        int eDay = sc.nextInt();
        int eMonth = sc.nextInt();
        int eYear = sc.nextInt();
        
        // check year -> past expected -> fixed fine .. no need to check anything else if the year is late!
        if (eYear != aYear){
            System.out.println(10000);
        } else if (eMonth != aMonth){
            if (eMonth < aMonth){
                System.out.println(500 * Math.abs(eMonth-aMonth));
            }
        } else if (eDay != aDay){
            System.out.println(15 * Math.abs(eDay-aDay));
        } else {
            System.out.println(0);         
        }
    }
}