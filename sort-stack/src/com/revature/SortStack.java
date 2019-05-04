package com.revature;

import java.util.Stack;

public class SortStack
{

	public static void main(String[] args)
	{
		Stack<Integer> myStack  = new Stack<>();
		
		System.out.println();

	}

	public static int indexOfMax(Stack<Integer> stack)
	{
		if(stack.empty())
			return -1;
		
		Integer max = stack.peek();
		
		Stack<Integer> tempStack = new Stack<>();
		
		tempStack.push(stack.pop())
		
	}
	
}
