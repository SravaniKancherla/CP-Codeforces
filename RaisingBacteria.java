package basic.programs.codeforces;

/**
 * https://codeforces.com/problemset/problem/579/A
 * You are a lover of bacteria. You want to raise some bacteria in a box.

Initially, the box is empty. Each morning, you can put any number of bacteria into the box. And each night, every bacterium in the box will split into two bacteria. You hope to see exactly x bacteria in the box at some moment.

What is the minimum number of bacteria you need to put into the box across those days?
 */

/**
 *  Solution :
 *  
 * 			Here no of days doesn't matter. so start with 1 bacteria and it keep on mutliplies
 * 			we will multiple until it is less than x and then we will add one more bacteria take separate count not in the same, because the day which we are adding or the no of days are not important
 * 			and then it multiples until this is less than remaining no
 * 			For Example take x =15
 * 				and start with 1(noBac =1) and it multiples till 8(1->2->4->8), if it is further multiplies which becomes 16>15 so stop at 8
 * 				15 - 8 = 7 , take another bacteria(noOfBac becomes 2), multiples till 4(1->2->4) and then 7-4 = 3(remaining)
 * 				take another bacteria 1->2(noOfbacteria becomes 3) , 3-2 =1 
 * 				finally we have to add one more bacterial. So total 4 bacteria required
 * 
 * 			For programming purpose we maitained ceach bacteria seperately
 *			actually the flow is 1->2(add 1)->3->6(add 1 bacteria)->7->14(add 1 )->15, So total 4 bacteria
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RaisingBacteria {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int n = 0;
		int ini = 0;
		do {
			x = x - n;
			n = 1;
			ini++;
			if (x == 1)
				break;
			while (2 * n <= x) {
				n = 2 * n;
			}

		} while (n != x);

		System.out.println(ini);
	}

}
