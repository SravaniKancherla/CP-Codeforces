package recursion;

/**
 * Problem Link : https://codeforces.com/problemset/problem/476/B
 * Problem Statement : Dreamoon and WiFi
 * Dreamoon is standing at the position 0 on a number line. Drazil is sending a list of commands through Wi-Fi to Dreamoon's 
 * smartphone and Dreamoon follows them.

Each command is one of the following two types:

Go 1 unit towards the positive direction, denoted as '+'
Go 1 unit towards the negative direction, denoted as '-'
But the Wi-Fi condition is so poor that Dreamoon's smartphone reports some of the commands can't be recognized and Dreamoon knows that some of them 
might even be wrong though successfully recognized. Dreamoon decides to follow every recognized command and toss a fair coin to decide those 
unrecognized ones (that means, he moves to the 1 unit to the negative or positive direction with the same probability 0.5).

You are given an original list of commands sent by Drazil and list received by Dreamoon. What is the probability that Dreamoon ends in the position
 originally supposed to be final by Drazil's commands?
 
 Solution Link : https://codeforces.com/contest/476/submission/195085656 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DreamoonAndWifi {
	/*
	 * Start from the left I'm recursively replacing the "?" symbol with a + or a -
	 * symbol.So there are two possibilities for every "?" symbol. If there are 3
	 * "?" symbols in the given string, then there are 2^3 = 8 possibilities. If the
	 * recursive call reaches "base case," meaning one of eight possibilities
	 * without a question mark, then I am calculating the final position. If the
	 * final position is equal to the given string final position, that is one of
	 * the possibilities for an answer. and we must calculate the probability =
	 * number of strings reaching the correct final position / total number of
	 * possible strings. 
	 * 
	 */
	public static int dreamoon(int finalpos, String received) {

		if (!received.contains("?")) {

			int res = 0;
			for (int i = 0; i < received.length(); i++) {
				if (received.charAt(i) == '+')
					res++;
				else
					res--;
			}
			if (res == finalpos)
				return 1;
			else
				return 0;
		}
		return dreamoon(finalpos, received.replaceFirst("\\?", "+"))
				+ dreamoon(finalpos, received.replaceFirst("\\?", "-"));
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st1 = br.readLine();
		String st2 = br.readLine();
		int finalPos = 0;
		int posb = 0;
		for (int i = 0; i < st1.length(); i++) {
			if (st2.charAt(i) == '?')
				posb++;
			if (st1.charAt(i) == '+')
				finalPos++;
			else
				finalPos--;
		}
		double cnt = dreamoon(finalPos, st2);
		cnt = cnt / Math.pow(2, posb);
		System.out.format("%.12f", cnt);

	}

}
