package com.sample;

public class primeCount {
	public static void main(String[] args)
	{
		System.out.println(isPrimeCount(2,13)); // 6
		System.out.println(isPrimeCount(11,29)); // 6
		System.out.println(isPrimeCount(20,22)); // 0
		System.out.println(isPrimeCount(1,1)); // 0
		System.out.println(isPrimeCount(5,5)); // 1
		System.out.println(isPrimeCount(6,2)); // 0
		System.out.println(isPrimeCount(-10,6)); // 3
		
		
		
		
			
	}
	
	public static int isPrimeCount(int start, int end)
	{
		if( end == 0 )
			return 0;
		int result = 0;
		
		if(start>end)
			return 0;
		
		if( start < 0)
          start = 2;
		
		for(; start <= end; start++) 
		{
			boolean isPrime = true;
			
			for(int i=2; i < start; i++)
			{
				if(start % i == 0)
					isPrime = false;
					
			}
			if(isPrime == true)
			{
				result++;
			}
		}
		return result;
	}

}
