package com.revature;

public class Substring
{

	public static void main(String[] args)
	{
		String test = "Hello World!";
		System.out.println(substring(test, 1, 5));
		System.out.println(substring(test, 0, test.length()));

	}
	
	public static String substring(String input, int start, int stop)
	{
		if(start<0 || start >= input.length())
			return null;
		if(stop < 0 || stop > input.length())
			return null;
		String returnVar= new String();
		
		for(int i = 0; i < input.length(); i++)
		{
			if(i >= start && i < stop)
				returnVar += input.charAt(i);
		}
		return returnVar;
	}

}
