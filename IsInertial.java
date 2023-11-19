package com.sample;
import java.util.*;

public class IsInertial {
	
	public static int IsInertial(int[] a)
	{
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		
		for(int n : a)
		{
			if(n % 2 == 0)
			{
				even.add(n);
			}
			else
				odd.add(n);
		}
		
		if(even.size() == odd.size())
		{
			return 0;
		}
		
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.addAll(even);
		
		List<Integer> even1 = new ArrayList();
		
		for(int s : set1)
		{
			even1.add(s);
		}
		
		Collections.sort(even1);
		
		if(even1.get(even1.size() - 1) < odd.get( odd.size() - 1))
			return 0;
		
		if(even1.get(even1.size() - 2) < odd.get(0)) 
			return 1;
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		 int a[] = {2, 12, 12, 4, 6, 8, 11};
		System.out.println(IsInertial(a));
	}

}
