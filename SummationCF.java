package recursion;

/**
 * Problem Link :
 * https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/L 
 * Summation
 * Given a number N and an array A of N numbers. Print the summation of the
 * array elements.
 * 
 * Note: Solve this problem using recursion.
 * 
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class SummationCF {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
	static long sum(int[] arr,int n,long sum) {
		if(n<0)
			return sum;
		sum+=arr[n];
		return sum(arr,n-1,sum);
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++){
			arr[i] = Integer.parseInt(st.nextToken());			
		}
		System.out.println(sum(arr,N-1,0));
		out.flush();
		
	}
}
