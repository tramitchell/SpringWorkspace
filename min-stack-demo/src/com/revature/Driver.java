package com.revature;

import com.revature.util.MyMinStack;

public class Driver
{
	
	public static void main(String[] args)
	{
		MyMinStack s = new MyMinStack(10);
		
		s.push("e");
		s.push("b");
		s.push("a");
		s.push("s");
		System.out.println(s.min());
		s.pop();  // pops "s"
		s.pop();  // pops "a"
		System.out.println(s.min());
		
		
	}
	
	
}
