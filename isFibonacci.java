package com.sample;

public class isFibonacci {
	
	public static int isFibonacci(int n)
	{
		if( n < 1) return 0;
		
		int x = 1;
		int y = 1;
		int z = 0;
		
		for(int i = 1; i <= n; i++) {
			
			z = x + y;
			
			if( z == n)
			{
				return 1;
			}
			
			x = y;
			y = z;
		}
		return 0;
	}

	public static void main(String[] args) {
		
      System.out.println(isFibonacci(13));
      System.out.println(isFibonacci(27));
      System.out.println(isFibonacci(34));
      System.out.println(isFibonacci(35));
      
      
	}

}
