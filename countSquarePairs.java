package com.sample;
import java.util.*;

public class countSquarePairs {
	
	public static int countSquarePairs(int[] a){
		
		List<Integer> list1 = new ArrayList<Integer>();
		int count = 0;
		for(int n : a) {
		    list1.add(n);
			
			
		}
		Collections.sort(list1);
		 
		for(int i = 0; i < a.length; i++)
		{
		  if( list1.get(i) < 1)
			  continue;
		   
			for(int j = i + 1; j < a.length; j++)
			{
				double squarVal = Math.sqrt(list1.get(i) + list1.get(j));
				if(squarVal * 10 % 10 == 0)
					count++;
			}
		}
		return count;
		 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {9, 0, 2, -5, 7};
		System.out.println(countSquarePairs(a));
	}

}
