package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/A 
 * A. Print Recursion time limit per test1 second memory limit per test256 megabytes
 * inputstandard input outputstandard output Given a number N . Print "I love
 * Recursion" N times.
 * 
 * Note: Solve this problem using recursion.
 *
 */
public class PrintRecursionCF {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
	static void print(int n) {
		if(n==0)
			return;
		System.out.println("I love Recursion");
		print(n-1);
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		print(n);
	}

}
