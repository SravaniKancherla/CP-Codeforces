package recursion;
/**
 * Problem Link: https://leetcode.com/problems/powx-n/
 * Problem Statement:  Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 * 
 * I've written three different recursive methods to find power(x, n), ranging from a naive to an efficient solution. )
 *
 */
public class PowerXtoN {
	
	public static double myPow1(double x, int n)  {
		if(n==0)
			return 1;
		return (n>0) ? x*myPow1(x,n-1):(1/x)*myPow1(x,n-1);
	} // T.c : O(n) and got "Stack overflow" for the larger value of X
		
	
	public static double myPow2(double x, int n)  {
		if(n==0)
			return 1;
		if(n>0)
			
		return(n%2==0)? myPow2(x,n/2)*myPow2(x,n/2): x*myPow2(x,n/2)*myPow2(x,n/2);
		else
			return (n%2==0)? myPow2(x,n/2)*myPow2(x,n/2): (1/x)*myPow2(x,n/2)*myPow2(x,n/2) ;
	} //Here used Divide and Conquer method 
	//T.C : O(2^logn) = O(n) -- got TLE, 
	/*
	 * There is a problem with the above solution, the same subproblem is computed twice for each recursive call.
	 *  We can optimize the above function by computing the solution of the subproblem once only.
	 */
	
	public static double myPow(double x, int n) {
		double temp;
		if(n==0)
			return 1;
		temp = myPow(x,n/2);
		if(n>0)
			return (n%2==0)? temp*temp:x*temp*temp;
		else
			return (n%2==0)? temp*temp:(1/x)*temp*temp;
	} // T.C : O(logn)
	
	public static void main(String args[]) {
		System.out.println(myPow(2,10	));	
		System.out.println(myPow(2,-2));
	}

}
