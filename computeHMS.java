package com.sample;
import java.util.*;


public class computeHMS {

	public static int[] computeHMS(int seconds)
	{
		
		int[] HMS = new int[3];
		
	    int h = 0;
	    int m = 0;
	    int s = 0;
	    
	    h = seconds / 3600;
	    s = seconds % 3600;
	    
	    m = s / 60;
	    s = s % 60;
	    
	    HMS[0] = h;
	    HMS[1] = m;
	    HMS[2] = s;
	    
	    
		
		return HMS;
		
	}
	public static void main(String[] args) {
		
		int[] a = computeHMS(3735);
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i] + " ");
		
	}

}
