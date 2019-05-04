package com.revature.recursion;

public class Factorial {
	// 5! = 5 * 4 * 3 * 2 * 1
	
	public int bangFact(int n)
	{
		if(n == 1)
			return 1;
		return n * bangFact(n - 1);
	}
}
