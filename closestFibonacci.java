package com.sample;

public class closestFibonacci{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(closestFibonacciCheck(12));
		System.out.println(closestFibonacciCheck(33));
		System.out.println(closestFibonacciCheck(34));
		
	}
public static int closestFibonacciCheck(int n)
{
	if( n < 0)
		return 0;
	int curr = 1;
	int prev = 1;
	
	while( curr <= n)
	{
		int t = curr;
		curr = prev + curr;
		prev = t;
	}
	
	return prev;
	
}
}