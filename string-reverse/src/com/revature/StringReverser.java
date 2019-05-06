package com.revature;

public class StringReverser
{

	public static void main(String[] args)
	{
		String s1 = "Hello World!";

		System.out.println(s1);
		
		System.out.println(stringReverse(s1));
	}

	public static String stringReverse(String str)
	{
		int L = str.length();
		for (int i = 0; i < L - 1; i++)
		{
			String s1 = str.substring(1,2);
			String s2 = str.substring(2, L - i);
			String s3 = str.substring(0, 1) + str.substring(L - i, L);
			str = s1 + s2 + s3;

		}
		return str;
		
	}
	
//	public static void stringReverse(String str)
//	{
//		char[] forwards = str.toCharArray();
//		char[] backwards = new char[str.length()];
//		for(int i = 0; i < str.length(); i++)
//			 backwards[str.length() - 1 - i] = forwards[i];
//		return new String(backwards);
//	}
}
