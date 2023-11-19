package com.sample;

public class BubbleSort {

	public static void main(String[] args)
	{
		int a[] = {11, 4, 20, 9, 2, 8};
		int temp = 0;
		
		for(int i=0; i< a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
			
		           if(a[i] > a[j])
		           {
		        	   temp = a[i];
		        	   a[i] = a[j];
		        	   a[j] = temp;
		           }
			
	     	}
     	}
		for(int e:a)
			System.out.print(e + " ");
     }
}
