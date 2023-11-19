package com.sample;

public class isHodder {

	public static int isHolder(int n)
	{
		if( n < 0)
			return 0;
		int cal = 0, j = 0, isHolder = 0;
		do {
            cal =(int) (Math.pow(2, j)) - 1;
             if(cal == n)
            	 isHolder = 1;
             j++;
		}
		while(cal <= n && isHolder == 0);
		
		return isHolder;
	}
	public static void main(String[] args) {
		
		System.out.println(isHolder(31));
		System.out.println(isHolder(3));
		System.out.println(isHolder(7));
		System.out.println(isHolder(127));
		System.out.println(isHolder(30));
		System.out.println(isHolder(5));
		
	
	}

}
