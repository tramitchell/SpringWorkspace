package com.revature.palindromes;

public class PalindromeStuff {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(""));
	}
	
	public static boolean isPalindrome(String s)
	{
		//wo
		char[] charArray = s.toCharArray();
		for(int i = 0; i < charArray.length / 2; i++)
			if(charArray[i] != charArray[charArray.length - 1 - i])
				return false;
		return true;
	}
	
	public static char generateChar()
	{
		int alpha = (int) ( Math.random() * 26);
		switch (alpha)
		{
		case 0:
			char = 'a';
			break;
		case 1:
			= 
		}
	}
}
