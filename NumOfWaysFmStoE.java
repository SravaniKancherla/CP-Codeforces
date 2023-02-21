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
	 * I declared one static variable to increment whenever you reach the
	 * destination.
	 * 
	 * Here, I have passed the distance to the recursive function that is equal to
	 * the distance between the end point and the start point. while calling the
	 * recursive function, decrement the d either by 1 or 2 or 3, so there are 3 paths for
	 * every node. If I reach d = 0, I have arrived at my destination and am
	 * incrementing the count by one because this is one of the paths; otherwise, I
	 * return without incrementing, as it cannot be the path to reach a destination.
	 * 
	 */
	public static void recursion(int d) {
		if (d < 0)
			return;
		if (d == 0) {
			count++;
			return;
		}
		recursion(d - 1);
		recursion(d - 2);
		recursion(d - 3);
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		recursion(E - S);
		System.out.println(count);
	}

}
