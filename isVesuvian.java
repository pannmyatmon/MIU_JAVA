package com.sample;

public class isVesuvian {

	// e 50 == 25 + 25 and 1 + 49. The numbers 65 (1+64, 16+49)
	// d 85 (4+81,36+49)
	public static int isVesuvian(int n) {
		
		 if( n < 0) return 0; 
		   int count = 0;
		   
		 for(int i = 1; (i * i) < n; i++) {		      
		   int sum1 = i * i;
		      
		     for( int j = 1; (j * j) < n; j++) {
		      
		      int sum2 = j * j ;

		        if( sum1 + sum2 == n) {	          
		            count++;
		            break; 
		          }
		      }
		     
		     if(count >= 2)
		       return 1;
		 }
		 return 0;	
	}
	public static void main(String[] args) {
	
		System.out.println(isVesuvian(50));
		System.out.println(isVesuvian(65));
		System.out.println(isVesuvian(85));

	}

}
