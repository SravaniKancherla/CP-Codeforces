package recursion;
/**
 * Problem Link:  https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/D
 * 
 * My submission :  https://codeforces.com/group/MWSDmqGsZm/contest/223339/submission/194406170
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintDigitsRecCF {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void print(int n) {

		if (n == 0)
			return;

		print(n / 10);
		out.print(n % 10 + " ");

	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				out.print(0);
			else
				print(n);
			out.println();
		}
		out.flush();

	}

}
