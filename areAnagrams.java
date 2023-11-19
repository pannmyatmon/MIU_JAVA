package com.sample;

public class areAnagrams {

	public static int areAnagrams(char[] a1, char[] a2) {
		
		if( a1.length != a2.length) return 0;
		
		char[] Copya1 = new char[a1.length];
		char[] Copya2 = new char[a2.length];
		
		for(int i = 0; i < a1.length; i++) {
			
			Copya1[i] = a1[i];
			Copya2[i] = a2[i];
			
		}
		
		for( int i = 0; i < Copya1.length; i++) {
			
			for(int j = 0; j < Copya2.length; j++) {
				
				if(Copya1[i] == Copya2[j]) {
					
					Copya1[i] = ' ';
					Copya2[j] = ' ';
					
				}
				
			}
		}
		
		for(int i = 0; i < a1.length; i++) {
			
			if(Copya1[i] != ' ' || Copya2[i] != ' ')  {
				
				return 0;
			}
				
		}
		
		
		return 1;
		
	}
	
	
	public static void main(String[] args) {
		
		char[] a1 = {'s', 'i', 't'};
		char[] a2 = {'i', 't', 's'};
		char[] b1 = {'s', 'i', 't'};
		char[] b2 = {'i', 'd', 's'};
		char[] c1 = {'b', 'i', 'g'};
		char[] c2 = {'b', 'i', 't'};
		
		System.out.println(areAnagrams(a1,a2));
		System.out.println(areAnagrams(b1,b2));
		System.out.println(areAnagrams(c1,c2));

	}

}
