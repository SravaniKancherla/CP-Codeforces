package collections.leetCode;

import java.util.Arrays;

public class NandDoubleExist {

public static boolean checkIfExist(int[] arr) {
        
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			int x = 2*arr[i];
			int j = Arrays.binarySearch(arr,x);
			if(j >=0)
			{
				return true;
			}
		}
		return false;
	
    }

	public static void main(String[] args) {
		int[] arr = {-2,0,10,-19,4,6,-8};
		System.out.println(checkIfExist(arr));
	}
}
