package recursion;

/** CODEFORCES
 * ************* Y. Number of Ways ***************
 * Problem Link : https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/Y
 * Problem Statement : 
 * Given two numbers S and E where S  denotes a start point and E  denotes an end point. Determine how many possible ways to reach point E
 * if you can move either 1 step, 2 steps or 3 steps at a time.
 *
 * Note: Solve this problem using recursion.
 *
 * Input Only one line contains two numbers S and E  (1≤S≤E≤15)
 *  Solution : https://codeforces.com/group/MWSDmqGsZm/contest/223339/submission/194412478
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumOfWaysFmStoE {
	static int count;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * 
	 */
	public static int recursion(int S,int E) {
		if (S > E)
			return 0;
		if (S == E) {
			
			return 1;
		}
		return recursion(S+1,E)+recursion(S+2,E)+recursion(S+3,E);
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		System.out.println(recursion(S,E));
		
	}

}
