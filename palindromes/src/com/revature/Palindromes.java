package com.revature;

public class Palindromes {

	public static void main(String[] args) 
	{
		System.out.println(isPalindrome("neveroddoreven"));
	}

	public static boolean isPalindrome(String s) 
	{
		
		
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length / 2; i++)
			if (charArray[i] != charArray[charArray.length - 1 - i])
				return false;
		return true;
	}

}
