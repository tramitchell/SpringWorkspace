package com.revature;

public class StringReverser {

	public static void main(String[] args) {
		String s1 = "Hello World!";
		
		System.out.println(s1);
		System.out.println( stringReverse(s1) );
	}
	
	private static String stringReverse(String str)
	{
		int size = str.length();
		char[] forwards = str.toCharArray();
		char[] backwards = new char[size];
		
		for(int i = 0; i < size; i++)
			 backwards[size - 1 - i] = forwards[i];
			
		return new String(backwards);
		
	}
}
