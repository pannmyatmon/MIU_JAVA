package com.sample;

public class isPairedN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPairedNCheck(new int[] { 1, 4, 1, 4, 5, 6},5));
		System.out.println(isPairedNCheck(new int[] { 1, 4, 1, 4, 5, 6} , 6));
		System.out.println(isPairedNCheck(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8} , 6));
		System.out.println(isPairedNCheck(new int[] { 1, 4, 1 } , 5));
		System.out.println(isPairedNCheck(new int[] { 8, 8, 8, 8, 7, 7, 7 } , 15));
		
		
		System.out.println(isPairedN(new int[] { 1, 4, 1, 4, 5, 6},5));
		System.out.println(isPairedN(new int[] { 1, 4, 1, 4, 5, 6} , 6));
		System.out.println(isPairedN(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8} , 6));
		System.out.println(isPairedN(new int[] { 1, 4, 1 } , 5)); //0
		System.out.println(isPairedN(new int[] { 8, 8, 8, 8, 7, 7, 7 } , 15)); //0
		
	}
	
	public static int isPairedNCheck(int[]a, int n)
	{
		int maxSumLen = (a.length - 1) + (a.length -2);
		
		if(n > maxSumLen) {
			return 0;
		}
		
		for( int i = 0; i < a.length; i++)
		{
			int j = n - i;
			
			if( j > a.length -1 || j < 0)
				continue;
				 
			if(j + i == n &&  a[i] + a[j] == n) {
				return 1;
			}
		}
		
		return 0;
	}
	
	 public static int isPairedN(int a[], int n)
	 {
		int maxSumLength = (a.length - 1) + (a.length -2 );

	        if ( n > maxSumLength) return  0;


	        for(int i = 0; i < a.length - 1; i++ ){
	       
	        	int j = n - i;
	        
	        if(j > a.length - 1 || j < 0) {
	        	continue;}
	        
	        if(a[i] + a[j] == n &&  i + j == n)
	         return 1;
	        }
	       
	   return 0;   

	 }   

	
}


