package com.revature;

import com.revature.util.NodeStack;

public class Driver
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		NodeStack<Integer> s = new NodeStack<Integer>();

		s.push(6);
		s.push(12);
		s.push(2);
		s.push(4);
		s.push(7);
		s.push(18);
		s.push(9);
		s.push(-1);
		s.push(6);
		System.out.println(s.getMin());
		s.pop(); // pops 6
		s.pop(); // pops -1
		System.out.println(s.getMin());

	}

}
