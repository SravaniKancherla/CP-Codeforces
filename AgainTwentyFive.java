package basic.programs.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem Link:  https://codeforces.com/contest/630/problem/A
 * @author Sravani
 	   Again Twenty Five! time limit per test0.5 seconds memory
 *         limit per test64 megabytes inputstandard input outputstandard output
 *         The HR manager was disappointed again. The last applicant failed the
 *         interview the same way as 24 previous ones. "Do I give such a hard
 *         task?" — the HR manager thought. "Just raise number 5 to the power of
 *         n and get last two digits of the number. Yes, of course, n can be
 *         rather big, and one cannot find the power using a calculator, but we
 *         need people who are able to think, not just follow the instructions."
 * 
 *         Could you pass the interview in the machine vision company in IT
 *         City?
 * 
 *         Input The only line of the input contains a single integer n (2 ≤ n ≤
 *         2·1018) — the power in which you need to raise number 5.
 * 
 *         Output Output the last two digits of 5n without spaces between them.
 */

/**
 * 
 * Solution : No matter how many times you multiply 5 by 5, the last two digits of the result will always be 25.  
 *	      
 */
public class AgainTwentyFive {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println("25");
	}
}
