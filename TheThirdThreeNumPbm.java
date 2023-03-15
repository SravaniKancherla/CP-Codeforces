package basic.programs.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TheThirdThreeNumPbm {
	
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i ++) {
			int n = Integer.parseInt(br.readLine());
			if(n%2 == 0) {
				out.println("0 0 "+(n/2));
			}
			else
				out.println("-1");
			
		}
		out.flush();
	}
}
