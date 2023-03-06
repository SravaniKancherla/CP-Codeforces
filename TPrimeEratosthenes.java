package basic.programs.codeforces;

/**
 * Problem Link: https://codeforces.com/problemset/problem/230/B
 * Problem Statement:  We know that prime numbers are positive integers that have exactly two distinct positive divisors. Similarly, we'll call a positive integer t Т-prime, if t has exactly three distinct positive divisors.

 * You are given an array of n positive integers. For each of them determine whether it is Т-prime or not.

 * Here I used the Sieve of Eratosthenes Approach, as the constraint says the integer of an array should be in the range xi (1 ≤ xi ≤ 10^12), and the array size is n (1 ≤ n ≤ 10^5).
 * When i tried the square-root approach, I got TLE. So if you follow the sieve approach once, if you find all the prime numbers till Sqrt(xi), then you get the T-prime or no in O(1).
 * To be T prime the number should be a square number, and then the square root should be the prime number. FirstCheck whether the given number is a square number. 
 * if yes then check square root of a given number is prime or not. If yes, then it has 3 divisors, which are: - 1, square root and number itself, so its T-prime
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TPrimeEratosthenes {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		boolean isComposite[] = new boolean[1000001];
		Arrays.fill(isComposite, false);
		isComposite[1] =true;
		for(int i=2;i<isComposite.length;i++) {
			if(!isComposite[i]) {
				for(int j=2*i;j<isComposite.length;j+=i) {
					isComposite[j] = true;
				}
			}
			
		}
		
		int n = Integer.parseInt(br.readLine());
		
		
	long x;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0;i<n;i++) {
			 x =Long.parseLong(st.nextToken());
			 int sq =  (int) Math.sqrt(x);
			 if(sq == Math.sqrt(x))
			 {
				 
				 if(isComposite[sq] == false)
					 out.println("YES");
				 else
					 out.println("NO");
			 }else
				 out.println("NO");
			
		}
		out.flush();
	}


}
