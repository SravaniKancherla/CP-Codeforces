package recursion;

/**
 * Problem Link: https://leetcode.com/problems/k-th-symbol-in-grammar/ 
 * Problem Statement : We build a table of n rows (1-indexed). We start by writing 0 in
 * the 1st row. Now in every subsequent row, we look at the previous row and
 * replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * 
 * For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row
 * is 0110. Given two integer n and k, return the kth (1-indexed) symbol in the
 * nth row of a table of n rows.
 * *
 */

/**
 * Let us observe the output first
 * for n=1     0       -- size 1 = 2^0
 * for n=2    01       -- size 2 = 2^1
 * for n=3    0110     ---- size 4 = 2^2
 * for n=4    01101001 ---- size 8 = 2^3
 * 
 * that means nth row is 2^(n-1) 
 * 
 * Given constraints are 1 <= n <= 30
 *			1 <= k <= 2 ^ (n - 1)
 *		if n = 30 the size will be 2^29 which cannot fit in String
 *			Instead of finding entire string try to find nth character using recursion
 *		For example, when n = 4 and k = 4, the value is 0, which is formed from the 2nd element of the 3rd row, which is 1, because size is doubling every time.
 *     	The third row second element is formed by the second row first element, which is formed by the first row first element.
 *		So according to the observation
 * 		If the previous element is zero and k is odd, return zero; otherwise, return one.
* 		Return 1 if the previous element was 1 and k was odd; otherwise, return 0. 
 */
public class KthSymbolNthRow {

	public static int kthGrammar(int n,int k) { 
		if(n==1)
			return 0;
		int ret = kthGrammar(n-1,(k+1)/2);
		if(ret ==0) {
			if(k%2==1)
				return 0;
			else 
				return 1;
		}else {
			if(k%2==1)
				return 1;
			else return 0;
		}
		
	}
	
	public static void main(String arg[]) {
		System.out.println(kthGrammar(1,1));
		
		System.out.println(kthGrammar(2,1));
		System.out.println(kthGrammar(2,2));
	}
}
