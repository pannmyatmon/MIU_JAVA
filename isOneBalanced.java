package com.sample;

public class isOneBalanced {

	public static int isOneBalance(int[] a)
	{
		 //  int[] B = { 1, 1, 1, 2, 3, -18, 45, 1, 0 }; // 0
		int oneCountOfFirstSeq = 0,  noneOneCountSeq = 0, oneCountOfSecondSeq = 0;

		int noneOneSecondSeq = 0; 
		int isOneBal = 1;
		

		// oneCountOfFirstSeq + oneCountOfSecondSeq = NoneOneCount; return 1;


		for( int i = 0; i < a.length && isOneBal == 1; i++) {

		   int current = a[i];

		   if( current == 1) {
		     
		        if ( noneOneCountSeq == 0 && oneCountOfSecondSeq == 0) {
		         oneCountOfFirstSeq ++;
		       }
		        
		       if( noneOneCountSeq > 0 )
		        oneCountOfSecondSeq++;
		             
		    } 
		    else 
		    { 
		    	if(oneCountOfSecondSeq == 0)
		    	{
		    	   noneOneCountSeq++;
		    	}
		    	else
		    	{
		    		
		  	         isOneBal = 0;
		  	         noneOneSecondSeq++;
		  	       
		    	}
		    

		    }
			
		 
		  }  
          
		if(noneOneSecondSeq == 0)
		{
		  if( oneCountOfFirstSeq  + oneCountOfSecondSeq  == noneOneCountSeq )
		          return 1;
		}

		return 0;  
		       
			      
	}
	public static void main(String[] args) {
		
		 int[] A = { 1, 1, 1, 2, 3, -18, 45, 1 }; // 1
         int[] B = { 1, 1, 1, 2, 3, -18, 45, 1, 0 }; // 0
         int[] C = { 1, 1, 2, 3, 1, -18, 26, 1 }; // 0
         int[] D = { }; // 1
         int[] A1 = { 3, 4, 1, 1 };  // 1
         int[] B1 = { 1, 1, 3, 4 }; // 1
         int[] C1 = { 3, 3, 3, 3, 3, 3 }; // 0
         int[] D1 = { 1, 1, 1, 1, 1, 1 }; // 0
		System.out.println(isOneBalance(A));
	    System.out.println(isOneBalance(B));
		System.out.println(isOneBalance(C));
		System.out.println(isOneBalance(D));
		System.out.println(isOneBalance(A1));
		System.out.println(isOneBalance(B1));
		System.out.println(isOneBalance(C1));
		System.out.println(isOneBalance(D1));
		
	}

}
