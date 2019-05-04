package com.revature;

public class SubstringChecker
{
	public static void main(String[] args)
	{
		System.out.println(contains("Hel", "Hello World!"));
		// System.out.println(new String("Hello World").substring(0, 1));
	}

	public static boolean contains(String smallString, String bigString)
	{
		if (smallString.length() > bigString.length())
			return false;

		for (int i = 0; i <= bigString.length() - smallString.length(); i++)
		{
			if (smallString.equals(bigString.substring(i, i + smallString.length())))
				return true;
		}
		return false;
	}
}
