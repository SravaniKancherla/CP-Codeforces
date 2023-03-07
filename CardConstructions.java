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
public class CardConstructions {
	
	/* Function to calculate no of cards required to construct a pyramid of a given height */
	public static int noOfCards(int h) {
		return ((h * (h + 1)) / 2) * 3 - h;
	}

	/* Here, I am calculating the maximum height of the pyramid we can construct using the given cards by starting from height 1. 
	 * If you found the maximum height, then finding remaining cards left by subtracting the no of cards used  from the given cards and incrementing count 1.
	 * and repeating the loop from height 1 again to find the maximum height of the pyramid you can construct with the remaining cards.
	 * Continue the loop until the number of remaining cards is less than or equal to one.
	 */
	
	public static int noOfPyramids(int cards) {
		int h = 1, count = 0;
		int noOfReqCards = 0;
		while (cards > 1) {
			noOfReqCards = noOfCards(h);

			if (noOfReqCards > cards) {
				h--;
				cards = cards - noOfCards(h);
				count++;
				h = 1;
			} else
				h++;

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
