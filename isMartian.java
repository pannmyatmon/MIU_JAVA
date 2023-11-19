package com.sample;

public class isMartian {
	
	public static int isMartian(int[] a)
	{
		int NumOfOne = 0;
		int NumOfTwo = 0;
		
	 for(int i = 0, j = 1; i < a.length; i++, j++)
	 { 
		if(j < a.length) {
			
		  if(a[i] == a[j]) 
			  return 0;
		}
		  if(a[i] == 1) 
			  NumOfOne++;
		  
		  if(a[i] == 2 )
			  NumOfTwo++;
 
		  }
		
		  if(NumOfTwo >= NumOfOne)
		  {
			  return 0;
		  }
		return 1;
	}

	public static void main(String[] args) {
	
		int[] a = {1, 2, 1, 2, 1, 2, 1, 2, 1};
		int[] b = {1 , 2, 3};
		System.out.println(isMartian(a));
		System.out.println(isMartian(b));
	}

}
