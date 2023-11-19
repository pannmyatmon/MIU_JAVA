package com.sample;

public class PrimeCount_Training {
	public static int PrimeCountTraining(int start, int end)
	{
        if(end == 1) return 0;
        
        if(start < 1)
        	start = 2;
        
        if(start == end)
        	return 0;
        
      
        int counter = 0;
        
        for(; start <= end; start++)
        {
        	boolean isPrime = true;
        	for(int i = 2; i < start; i++)
        	{
        	   if(start % i == 0)
        		   isPrime = false;
        	 
        	}
        	  if(isPrime)
       		   counter++;
           
        }
        	return counter;
	}

	public static void main(String[] args) {
	System.out.println(PrimeCountTraining(10,30));
	System.out.println(PrimeCountTraining(-10,6));
	}

}
