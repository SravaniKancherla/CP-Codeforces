package basic.programs.leetCode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Stream;

/**
 * Here i am going to use PriorityQueue as it follows minheap structure
 * 
 * 1. if k> array size, cannot find kth largest element return -1 2. always
 * maintain PriorityQueue of size k and the kth largest element is the first
 * element of the PriorityQueue 3. Iterate through k+1th element to n and for
 * each element check whether its <kth largest element. If yes then neglect it
 * otherwise remove the smallest element which is the kth largest element and
 * insert this new element and return new kth largest element.
 * 
 *
 */
public class KthLargest {
	PriorityQueue<Integer> pq;
int k;
	public KthLargest(int k, int[] nums) {
		// Given a constraint that "It is guaranteed that there will be at least k
		// elements in the array when you search for the kth element." So, i am checking
		// whether k is smaller
		// than length of the array or no
		this.k = k;
		pq = new PriorityQueue<>();
		for (int i = 0; i < nums.length; i++) {
			if (i < k) {
				pq.add(nums[i]);
			} else {
				if (nums[i] > pq.peek()) {
					pq.poll();
					pq.add(nums[i]);
				}

			}

		}

	}

	public int add(int val) {
		System.out.println(k+" k value");
		
		if(pq.size()<k) {
			pq.add(val);
			return pq.peek();
		}
		if (val > pq.peek()) {
			pq.poll();
			pq.add(val);
			return pq.peek();
		} else
			return pq.peek();
	}

	public static void main(String args[]) {
		/*
		 * PriorityQueue<Integer> pq = new PriorityQueue<>(); pq.add(10); pq.add(20);
		 * pq.add(50); System.out.println(pq.poll());
		 * 
		 * pq.add(40); System.out.println(pq); pq.add(15); pq.add(12);
		 * System.out.println(pq);
		 */

		KthLargest lar = new KthLargest(2, new int[] { 0 });
		System.out.println(lar.add(-1));
		System.out.println(lar.add(1));
		System.out.println(lar.add(-2));
		System.out.println(lar.add(-4));
		System.out.println(lar.add(3));
		

	}

}
