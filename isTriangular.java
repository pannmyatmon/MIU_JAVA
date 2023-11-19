package com.sample;

public class isTriangular {
	
	public static int isTriangular(int n)
	{
		if( n < 0) return 0;
		
		int sum = 0;
		
		for(int i = 1; sum <= n; i++)
		{
		   sum += i;	
		   if(sum == n)
				return 1;
		}
		
		
		
		return 0;
	}

	public static void main(String[] args) {

		System.out.println(isTriangular(21));

	}

}
