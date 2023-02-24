package recursion;

/**
 * Problem Link:  https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/S
 * Problem Statment:  S. Array Average
 * Given a number N  and an array A  of N
 * numbers. Calculate the average of these numbers.
 * Note: solve this problem using recursion.
 * 
 * Solution Link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/submission/194636324
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayAvgCF {

	public static double average(int[] arr, int n, long sum) {
		if (n == 0)
			return sum / arr.length;

		return average(arr, n - 1, sum += arr[n - 1]);

	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

		}

		System.out.format("%.6f", average(arr, n, 0));

	}

}
