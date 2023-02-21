package recursion;

/**
 * . Print from 1 to N
time limit per test1 second
memory limit per test64 megabytes
inputstandard input
outputstandard output
Given a number N. Print numbers from 1 to N in separate lines.

Note: Solve this problem using recursion.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Print1ToNRecCF {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	static void print(int n) {
		if (n == 0)
			return;

		print(n - 1);
		System.out.println(n);
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		print(n);
	}

}
