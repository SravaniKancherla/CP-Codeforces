package recursion;
/**
 * *********** 3n + 1 sequence ********* 
 * Problem Link :
 * https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/Q 
 * Problem Statement : 
 * Given a number n , you should print the length of the 3n+1
 * sequence starting with n .
 * 
 * The sequence is constructed as follows:
 * 
 * If the number n is odd, the next number will be 3n+1 . If the number n is
 * even, the next number will be n/2 . For example, the 3n+1 sequence of 3 is
 * {3,10,5,16,8,4,2,1 } and its length is 8 .
 *
 *  Solution:  https://codeforces.com/group/MWSDmqGsZm/contest/223339/submission/194411514
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class SequenceCF {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/* Here I used a conditional statement, and if n is even, I am calling a recursive function with the value n/2, else 3n+1.
	 * every time, incrementing the result by 1, and if you reach the condition n == 1, then returning a recursive function.
	 */
	public static int seq(int n) {
		if(n==1)
			return 1;
		return n%2==0?1+seq(n/2):1+seq(3*n+1);
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		System.out.println(seq(n));
	}
}
