package recursion;
/**
 * Problem Link : 	https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/V
 * Problem Statement: Creating Expression1
 * Given two numbers N, X and an array A of N numbers. Determine if there is a way to put '+' or '-' signs between every two numbers in the array A
 * in order to make an expression that is equal to X
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CreatingExpCF {
	
		/**
		 * Below are the steps I followed for creating an expression using the given array and the value X (the expression result should be X).        
		 * 1. Begin with the first array element and either + or - the second element, forming two paths from element 1 to element 2, and then from element 2 to element 3.
		 * continue until you have completed all of the elements.
		 * 2. Once you've reached the leaf nodes, find the node whose value equals the given number X.
		 * If it has at least one leaf node, you've found at least one path, so return true (the equation can be formed), otherwise return false (the equation cannot be formed).
		 * 
		 */
		static boolean expression(int[] arr,int i,long sum,long X){
		
		if(i==arr.length) {				
			if(sum==X)				
				return true;
			else 
				return false;			
		}
	
		return expression(arr,i+1,sum+arr[i],X) || expression(arr,i+1,sum-arr[i],X);
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long X = Long.parseLong(st.nextToken());
		 st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

		}
		if(expression(arr,1,arr[0],X))
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
