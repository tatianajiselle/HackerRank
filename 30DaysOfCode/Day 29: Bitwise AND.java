import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

	        System.out.println(solve(n, k));
		}

		sc.close();
	}

	static int solve(int n, int k) {
        int result = 0;
        
		for (int a = 1; a <= n; a++) {
			for (int b = a + 1; b <= n; b++) {
				int current = a & b;
                
                if (current > result && current < k) {
					result = current;
				}
			}
		}
		return result;
	}
}