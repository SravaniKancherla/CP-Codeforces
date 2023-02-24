package recursion;

import java.util.Arrays;

public class TribonacciNumLC {
	
	//Giving TLE 
    public static int tribonacci(int n){
    	int[] dp = new int[n+1];
    	Arrays.fill(dp, -1);
    	
    	return memorized(n,dp);
    }
    
    public static int memorized(int n, int[] dp) {
    	if(n<2) return n;
    	if(n== 2) return 1;
    	if(dp[n-1] != -1)
    		return dp[n];
    	
    	return dp[n] = memorized(n-1,dp)+memorized(n-2,dp)+memorized(n-3,dp);
    }
    
    
    
    public static void main(String[] args) {
    	
    	
    	System.out.println(tribonacci(25));
    }
}
