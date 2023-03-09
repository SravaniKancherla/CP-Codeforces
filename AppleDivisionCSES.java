package recursion;
/**
 * There are n apples with known weights. Your task is to divide the apples into two groups so that the difference between the weights of the groups is minimal.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AppleDivisionCSES {
/**
 *  I followed a recursive approach.
 *	For each recursive call, divide into two calls by placing the nth element in basket 1 first and then placing it in basket 2, not basket 1, second.
 *  If we are done with the array elements, we will return the difference between some of the elements of basket1 and basket2, and while traversing back, 
 *  we will return the minimum value of two child calls to the parent.
 * 
 */
	public static long appleDivision(int[] arr,int n,long sum1,long sum2) {
		
		if(n==-1) {
			return Math.abs(sum1-sum2);
		}
		
		long newSum1= sum1+arr[n];
		long newSum2 = sum2+arr[n];
		return Math.min(appleDivision(arr,n-1,newSum1,sum2),appleDivision(arr,n-1,sum1,newSum2));
			
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		System.out.println(appleDivision(arr,n-1,0,0));
	}
	
}
