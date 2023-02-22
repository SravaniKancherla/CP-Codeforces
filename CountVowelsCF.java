package recursion;
/**
 * Problem Link :  https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/I
 * Problem Statment :
 * Given a string S. Print number of vowels in the string.
 * Note:
 *  Vowel letters: ['a', 'e', 'i', 'o', 'u'].
 *  Vowel letters could be capital or small.
 *  Solve this problem using recursion.
 *  
 *  CF Solution Link : https://codeforces.com/group/MWSDmqGsZm/contest/223339/submission/194551533
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountVowelsCF {

	/**
	 * The sVowel() method checks whether the input character is a vowel or not.
	 * It can be either uppercase or lowercase, resulting in a total of ten comparisons.
	 * To reduce the number of comparisons, I'm converting all characters to upper case and determining whether or not they're vowels.
     * if vowel it returns 1 or 0.
	 * @param ch
	 * @return
	 */
	public static int isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch == 'U')
			return 1;
		return 0;
	}
	
	/**
	 * The countVowels() method retrieves each character and passes it to the isVowel() method to determine whether it is a vowel or not.
     *
     * adds the return value of isVowel() to the final output using recursion. 
	 * @param str
	 * @param n
	 * @return
	 */
	public static int countVowels(String str, int n) {
		
		if(n==1)
			return isVowel(str.charAt(n-1));
		
		return isVowel(str.charAt(n-1))+countVowels(str,n-1);
			
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		System.out.println(countVowels(str,str.length()));
	}
}
