import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        int i = 0;
        
        for(int grade: grades){
            if (grade >= 38){
                if (grade%5 > 2){
                    double temp = 5*(Math.ceil((double)grade/5));
                    grade = (int)temp;
                }
                grades[i] = grade;
            }
            else {
                grades[i]= grade;
            }
            i++;
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
