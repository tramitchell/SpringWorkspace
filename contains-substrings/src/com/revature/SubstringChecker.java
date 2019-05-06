package com.revature;

public class SubstringChecker
{
	public static void main(String[] args)
	{
		System.out.println(contains("Hel", "Hello World!"));
	}

	public static boolean contains(String smallString, String bigString)
	{
		if (smallString.length() > bigString.length())
			return false;

		for (int i = 0; i <= bigString.length() - smallString.length(); i++)
		{
			if (smallString.equals( bigString.substring(i, i + smallString.length())) )
				return true;
		}
		return false;
	}
}
