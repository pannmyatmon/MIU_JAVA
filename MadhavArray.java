package com.sample;

public class MadhavArray {
	
	public static void main(String[] args)
	{
		int[] a = {2, 1, 1, 4, -1, -1};
		System.out.println(isMadhavArray(a));
	}
	
	public static int isMadhavArray(int[] a)
	{
		int n = 2;
		
		boolean correctLength = false;
		
		while(n * (n + 1) <= a.length * 2)
		{
			
			if(n * (n + 1) == a.length * 2)
			{
				correctLength = true;
				break;
			}
			else
				n++;
		}
		
		if(!correctLength)
		{
			return 0;
		}
		
		int num = 2;
		
		for(int i = 1; i < a.length;)
		{
		  int sum = 0;
		  for( int j = i; j < i + num; j++ )
		  {
			  sum = sum + a[j];
			  			  
		  }
			
		  if(sum != a[0]) return 0;
		  
		  i = i + num;
		  num++;
		  
		}
		return 1;
	}

}
