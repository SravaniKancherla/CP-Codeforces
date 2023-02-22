package recursion;

/**
 * Problem Link : https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/O
 * Problem Statment :
 * Given a number N. Print the value of the Nth Fibonacci number.
 * Note: Solve this problem using recursion.
 * Input
	Only one line containing a number N (1 ≤ N ≤ 30).
	
	CF Solution Link : https://codeforces.com/group/MWSDmqGsZm/contest/223339/submission/194553087
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciCF {

	public static int fib(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fib(n));
	}

}
