package com.sample;

public class is235Array {
//	{2, 3, 5, 7, 11}

	public static int is235Array(int[] a){
        
	      int numOfDivByTwo = 0;
	      int numOfDivByThree = 0;
	      int numOfDivByFive = 0;
	      int noneDivisiable = 0;

	      for(int i = 0; i < a.length; i++){
	    	  if (a[i] % 2 == 0 || a[i] % 3 == 0 || a[i] % 5 == 0) {
	      
	      if(a[i] % 2 == 0)
	         numOfDivByTwo++;
	      
	       if(a[i] % 3 == 0)
	    	   numOfDivByThree++;
	     
	      if(a[i] % 5 == 0)
	       numOfDivByFive++;
	    	  }
	    	  else
	      
	         noneDivisiable++;
	      }

	     if(numOfDivByTwo + numOfDivByThree + numOfDivByFive + noneDivisiable != a.length)
	         return 0;


	    return 1;

	}

	
	public static void main(String[] args) {
		
		int[] a = {2, 3, 5, 7, 11};
		System.out.println(is235Array(a));

	}

}
