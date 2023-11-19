package com.sample;

public class isMercurial {
	
	public static int isMercurial(int[] a) {
		
		int indexOfOne = -1, indexOfThree = -1;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] == 1)
			{ 
				if(indexOfOne > -1 && indexOfOne < indexOfThree && i > indexOfThree)
				  return 0;
				
						  
			indexOfOne = i;
				
				
			}
			
			if(a[i] == 3)
			{
				indexOfThree = i;
			}
			
			
		}
		return 1;
			
	}

	public static void main(String[] args) {
		
		int[] m = {1, 2, 10, 3, 15, 1, 2, 2};
		int[] m1 = {5, 2, 10, 3, 15, 1, 2, 2};
		int[] m2 = {1, 2, 10, 3, 15, 16, 2, 2};
		int[] m3 = {3, 2, 18, 1, 0, 3, -11, 1, 3};
		int[] m4 = {2, 3, 1, 1, 18};
		int[] m5 = {8, 2, 1, 1, 18, 3, 5};
		int[] m6 = {3, 3, 3, 3, 3, 3};
		int[] m7 = {1};
		int[] m8 = {};
		
		System.out.println(isMercurial(m));  //0
		System.out.println(isMercurial(m1)); //1
		System.out.println(isMercurial(m2)); //1
		System.out.println(isMercurial(m3)); //0
		System.out.println(isMercurial(m4)); //1
		System.out.println(isMercurial(m5)); //1
		System.out.println(isMercurial(m6)); //1
		System.out.println(isMercurial(m7)); //1
		System.out.println(isMercurial(m8)); //1
		
		
				


	}

}
