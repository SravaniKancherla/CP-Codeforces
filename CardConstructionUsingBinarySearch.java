package basic.programs.codeforces;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *  Problem Link :https://codeforces.com/problemset/problem/1345/B
 *  
 * Card Constructions A card pyramid of height 1 is constructed by resting two
 * cards against each other. For h>1 , a card pyramid of height h is constructed
 * by placing a card pyramid of height h−1 onto a base. A base consists of h
 * pyramids of height 1 , and h−1 cards on top. You start with n cards and build
 * * the tallest pyramid that you can. If there are some cards remaining, you *
 * build the tallest pyramid possible with the remaining cards. You repeat this
 * * process until it is impossible to build another pyramid. In the end, how
 * many * pyramids will you have constructed
 * 
 * 
 * Solution Link in CodeForces : https://codeforces.com/contest/1345/submission/196335165
 *
 */
public class CardConstructionUsingBinarySearch {
	
	/* Function to calculate no of cards required to construct a pyramid of a given height */
	public static long noOfCards(long h) {
		return ((h * (h + 1)) / 2) * 3 - h;
	}

	
	
	public static int noOfPyramids(long cards) {
		int  count = 0;
				
		while (cards > 1) {
			long low =1,high = cards;
			long rem = cards;
			long mid;
			while(low<=high) {
				mid = (low+high)/2;
				long required = noOfCards(mid);
				if(required<=cards) {
					rem = cards-required;
					low = mid+1;
				}
				else {
					high = mid-1;
				}
				//System.out.println(rem+"  "+low+"  "+high);
				
			}
			count++;
			
			cards = rem;
		}
		return count;
	}

	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		int T = Integer.parseInt(br.readLine());
		int cards = 0;

		for (int i = 0; i < T; i++) {
			cards = Integer.parseInt(br.readLine());
			out.println(noOfPyramids(cards));
		}
		out.flush();

	}
}

