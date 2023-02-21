package recursion;
/**
 * 
 * Problem Link:  https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/P
 * 
 * Statement :
 * Given a number N Print ⌊log2(N)
 * Note: Solve this problem using recursion.
 * Input
 * Only one line containing a number N  (1≤N≤1018)
 * 
 * Solution Link in CF : https://codeforces.com/group/MWSDmqGsZm/contest/223339/submission/194419706
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Log2CF {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
	public static long log2(long n) {
		if(n <= 1)
			return 0;
		return 1+log2(n/2);
		
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		long n = Long.parseLong(br.readLine());
		System.out.println(log2(n));
	}
	
}
