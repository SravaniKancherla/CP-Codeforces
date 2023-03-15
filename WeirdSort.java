package basic.programs.codeforces;

/**
 * CF Problem Link: https://codeforces.com/problemset/problem/1311/B
 * Problem Statement :  You are given an array a  of length n
 * You are also given a set of distinct positions p1,p2,…,pm, where 1≤pi<n
 * The position pi means that you can swap elements a[pi] and a[pi+1]
 * You can apply this operation any number of times for each of the given positions.

 * Your task is to determine if it is possible to sort the initial array in non-decreasing order (a1≤a2≤⋯≤an) using only allowed swaps.
 * 
 * CF Solution Link:  https://codeforces.com/contest/1311/submission/197460644
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WeirdSort {
 /* Approach :
  *  Solved using the "bubble sort concept."
  *  While sorting using bubble sort, whenever we need to swap the elements, I am checking whether that swap element index value is present in the pos[] array.
  *  If exists, continue, or else print no and exit.
  *  For checking whether that index is present in a pos[] array, I am using a binary search. So I sorted the pos[] array first and then performed a binary search.
  */
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter out = new PrintWriter(System.out);

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int arr[] = new int[n];
			for (int j = 0; j < n; j++)
				arr[j] = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int pos[] = new int[P];
			for (int j = 0; j < P; j++) {
				pos[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(pos);
			String result = "YES";
			for (int j = n - 1; j > 0; j--) {
				for (int k = 0; k < j; k++) {
					if (arr[k] > arr[k + 1]) {
						if (Arrays.binarySearch(pos, k + 1) >= 0) {
							int temp = arr[k];
							arr[k] = arr[k + 1];
							arr[k + 1] = temp;
						} else {
							result = "NO";
							break;
						}
					}
				}
			}
			out.println(result);

		}
		out.flush();

	}
}
