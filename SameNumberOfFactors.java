package com.sample;

public class SameNumberOfFactors {
	
	public static void main(String[] args)
	{
		System.out.println(SameNumberOfFactorsCheck(-6,21));
		System.out.println(SameNumberOfFactorsCheck(6,21));
		System.out.println(SameNumberOfFactorsCheck(8,12));
		System.out.println(SameNumberOfFactorsCheck(23,97));
		System.out.println(SameNumberOfFactorsCheck(0,1));
		System.out.println(SameNumberOfFactorsCheck(0,0));
		
	}
	
	public static int SameNumberOfFactorsCheck(int n1, int n2)
	{
		if(n1 < 0 || n2 < 0)
			return -1;
		
		if(n1 == n2)
			return 1;
		
		if(NumberOfFactor(n1) != NumberOfFactor(n2))
		{
			return 0;
		}
		
		return 1;
	}
	
	private static int NumberOfFactor(int n)
	{
		if (n == 0)
			return 0;
		int counter = 0;
		
		for( int i = 1; i <=n; i++)
		{
			if(n % i == 0)
				counter++;
		}
		return counter;
	}

}
