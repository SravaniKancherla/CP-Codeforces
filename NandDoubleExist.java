/**
 * Problem Statement : 
 * Given an array arr of integers, check if there exist two indices i and j such that :
	i != j
	0 <= i, j < arr.length
	arr[i] == 2 * arr[j]
	
	Problem Link: https://leetcode.com/problems/check-if-n-and-its-double-exist/
	
 */
import java.util.Arrays;

public class NandDoubleExist {

	/**
	 * Below are the steps I followed.
	 * 1. Sorted the array :  T.C O(nlogn)
	 * 2. Traversing through the array, for each element "x", find the no. 2x by using BinarySearch. 
	 * 3. If it exists, return true; otherwise, return false.
	 * 4. Here I checked one more condition that i!=j, otherwise if arr[i] == 0, it would return the same index and 2*0 =0.
	 *  Total Time Complexity = for array sorting + no of elements *  binary search
	 *                        = (nlogn + n*logn) = O(nlogn).
	 * 
	 * You can implement the same program without sorting the array, but it will take O(n^2) to search n elements in the array.
	 */
	public static boolean checkIfExist(int[] arr) {

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int x = 2 * arr[i];
			int j = Arrays.binarySearch(arr, x);
			if (j >= 0 && i != j) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[] arr = { -2, 0, 10, -19, 4, 6, -8 };
		System.out.println(checkIfExist(arr));
	}
}
