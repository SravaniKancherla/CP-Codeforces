package recursion;

/**
 * Problem Link : https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/E
 * Problem statement : 
 * Given a number N. Print the binary equivalent of N.
 *
 * Note: Solve this problem using recursion.
 * Input
 * First line contains a number T (1 ≤ T ≤ 104) number of test cases.
 *
 * Next T lines will contain a number N (1 ≤ N ≤ 109).
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BinaryConersionCF {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	static String fun(int n, String s) {
		if (n == 0)
			return s;
		return fun(n / 2, (n % 2) + s);
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			out.println(fun(n, new String()));

		}
		out.flush();

	}
}
