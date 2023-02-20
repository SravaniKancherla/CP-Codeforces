package basic.programs.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * 
 * @author Sravani C. ABBB time limit per test1 second memory limit per test256
 *         megabytes inputstandard input outputstandard output Zookeeper is
 *         playing a game. In this game, Zookeeper must use bombs to bomb a
 *         string that consists of letters 'A' and 'B'. He can use bombs to bomb
 *         a substring which is either "AB" or "BB". When he bombs such a
 *         substring, the substring gets deleted from the string and the
 *         remaining parts of the string get concatenated.
 * 
 *         For example, Zookeeper can use two such operations: AABABBA → AABBA →
 *         AAA.
 * 
 *         Zookeeper wonders what the shortest string he can make is. Can you
 *         help him find the length of the shortest string?
 * 
 *         Input Each test contains multiple test cases. The first line contains
 *         a single integer t (1≤t≤20000) — the number of test cases. The
 *         description of the test cases follows.
 * 
 *         Each of the next t lines contains a single test case each, consisting
 *         of a non-empty string s : the string that Zookeeper needs to bomb. It
 *         is guaranteed that all symbols of s are either 'A' or 'B'.
 * 
 *         It is guaranteed that the sum of |s| (length of s ) among all test
 *         cases does not exceed 2⋅105 .
 * 
 *         Output For each test case, print a single integer: the length of the
 *         shortest string that Zookeeper can make.
 */
public class ABBB {
	/**
	 * 
	 * @param str
	 * Here I have done like I removed all  AB's then again travel one more if any new AB's formed because of removal of
	 * earlier AB's then it will remove. It will continue until all ABs got removed and then travel again to remove all BBS
	 * This worked but got TLE
	 */
	public static String abbb(String str) {
		while (str.contains("AB")) {
			str = str.replaceAll("AB", "");
		}

		while (str.contains("BB")) {
			str = str.replaceAll("BB", "");
		}
		return str;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 * Here I am using stack because whenever you encounter B you can remove earlier element even if it is 'A' or 'B' because you
	 * have to remove all 'BB' s and all 'AB's
	 * 
	 * so if stack is empty or if I get 'A' then pushing into the stack
	 * if It is B and stack is not empty popping so that it removes recent inserted element which forms either BB or AB, anything fine
	 * so If we encounter B again pop so that it deletes newly  formed  AB or BB because of deletion of earlier one
	 */
	public static int abbb_stack(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			if(stack.empty()  || str.charAt(i)=='A')
				stack.push(str.charAt(i));
			else if(str.charAt(i)=='B' && !stack.empty())
				stack.pop();
		}
		return stack.size();
	}
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		for(int i=0;i<T;i++) {
		String str = br.readLine();
			
		out.println(abbb_stack(str));
		}
		out.flush();
	}
}
