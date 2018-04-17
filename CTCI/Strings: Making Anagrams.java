import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        
        // assuming both strings cant be empty
		int deletions = 0;
        int[] charFrequencies = new int[26];
        
        // add to character buffer the freq of first string
        for(char c : first.toCharArray()){
			charFrequencies[c-'a']++;
		}
        
        // subtract the frequencies of the second string from the first
		for(char c : second.toCharArray()){
			charFrequencies[c-'a']--;
		}
        
        // anything remaining in the buffer needs to be removed
		for(int i : charFrequencies){
			deletions += Math.abs(i);
		}
        
		return deletions;
	}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
