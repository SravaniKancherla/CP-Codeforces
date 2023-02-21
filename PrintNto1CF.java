package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintNto1CF {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	static void print(int n) {
		if (n == 1) {
			System.out.print(n);
			return;
		}
		
		System.out.print(n+" ");
		print(n - 1);
		
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		print(n);
	}
}
