package collections.leetCode;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * Problem Link : https://leetcode.com/problems/next-greater-element-i/
 * Problem Statement : The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

 * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 * 
 * 
 *
 */
public class NextGreaterElement {
	/*
	 * Approach I followed:
	 * 1. find the next greatest element array for each element in nums2
	 *   There are 2 approaches to find next greater element
	 *   a. for each element ai next greatest element is traverse from ai+1 to an-1 and if you find then go for next element
	 *   	T.C is O(n^2)  in worst case
	 *   b. another approach is start from the end of the array follow below steps
	 *   Here we will store the next greater element in Stack. 
	 *	 There are 2 possibilities
	 * 			i. 	greater than the next element
	 * 			   	if we encounter a greater element we have to pop all the elements which are smaller than that
	 * 				and then push this one because for the next element this will be the nearest greater element, even there can be so many greater elements but this is 
	 * 				nearest greater element until unless next element is greater that that. 
	 * 
	 * 			ii. Smaller or equal to the previous element 
	 * 				if  you encounter a smaller element which is less than the previous element we will push it and nearest greater is the previous element only 
	 *			  	and the reason we need to push this element is that for the next element it might be the nearest greater means next element can be smaller that this. 
	 * 
	 * 			if stack is empty means there is no previous element which is greatest so print -1 
	 * 
	 *  I followed second approach as it takes linear time to find next greatest element for each element of the array.
	 */
public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
			int n = nums2.length;
			int[] nextGreatEle = new int[n];
			ArrayDeque<Integer> stack = new ArrayDeque<>();
			nextGreatEle[n-1] = -1;
			stack.push(nums2[n-1]);
			for(int i =n-2; i>=0;i--) {
				while(stack.isEmpty()==false && nums2[i] > stack.peek() ) {
					stack.pop();
				}
				if(stack.isEmpty()) {
					nextGreatEle[i] = -1;
					
				}else
					nextGreatEle[i] = stack.peek();
				stack.push(nums2[i]);
					
			}  //T.C 0(n)
			
			// we have found the nextGreatEle[] which contains greater elements for each element in an array
			//now for each element of nums1 find the index position in nums2 and then return the corresponding next greater element from nextGreatEle[] array.
			
			int[] res = new int[nums1.length];
			
			for(int i =0;i<nums1.length;i++) {
				for(int j=0;j<n;j++) {
					if(nums1[i] ==nums2[j]) {
						res[i] = nextGreatEle[j];
					}
				}
			}
			return res;
    }

public static void main(String args[]) {
	int[] nums1= {2,4};
	int[] nums2 = {1,2,3,4};
	
	int[] res = nextGreaterElement(nums1,nums2);
	
	System.out.println(Arrays.toString(res));
	
	
}

}
