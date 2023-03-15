package basic.programs.codeforces;
/**
 * 
 * Problem Link: Multiplication Table
 * 
 * Problem Statement:
 *  
 * Let's consider a table consisting of n rows and n columns. The cell located at the intersection of i-th row and j-th column contains number i × j. 
 * The rows and columns are numbered starting from 1.
 * You are given a positive integer x. Your task is to count the number of cells in a table that contain number x.
 *  
 * CF Solution Link: https://codeforces.com/contest/577/submission/197457482
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * I discovered the factors here by employing the square root method. found the factors between 1 and sqrt(x), and for every factor, incremented the count by except when i=n/i.
 * example, a 5*5 cell.
 * One more condition is that the factor should be less than the number of columns; otherwise, that cell doesn't exist. 
 * @author Sravani
 *
 */
public class MultiplicationTable {
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int count=0;
		for(int i=1;i*i<=x && i<=n;i++) {
			if(x%i ==0 && x/i<=n ) {
				if(x/i==i)
					count++;
				else
					count+=2;
			}
		}
		System.out.println(count);
	}

}
