package com.revature;

import java.util.Stack;

public class SortStack
{
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args)
	{

		stack.push(5);
		stack.push(10);
		stack.push(9);
		stack.push(2);
		stack.push(9);
		stack.push(12);
		stack.push(-2);
		stack.push(15);
		stack.push(6);
		stack.push(3);
		
		sort(stack);

		while(!stack.empty())
			System.out.println(stack.pop());

	}

	public static void sort(Stack<Integer> originalStack)
	{
		// we will build sorted stack from the ground up
		Stack<Integer> sortedStack = new Stack<Integer>();
		// garbage stack is a temporary storage place for unsorted data
		Stack<Integer> garbageStack = new Stack<Integer>();
		
		int size = originalStack.size();
		for(int c = 0; c < size; c++)
		{
			// pop values into the garbage stack until we find the max
			int indexOfMax = indexOfMax(originalStack);
			for(int i = 0; i < indexOfMax; i++)
				garbageStack.push( originalStack.pop() );
			
			// once we find the max, push it to the bottom of the sortedStack
			sortedStack.push(originalStack.pop());
			
			// pop the garbage stack onto the original stack
			// just to get everything in one place
			// this loop must iterate the same number of times as 
			// the for loop above
			int putItBack = indexOfMax;
			for( int i = 0; i < putItBack; i++)
				originalStack.push( garbageStack.pop() );
			
			// repeat until original stack is depleted
		}
		
		// make the stack point to the sortedStack
		stack = sortedStack;
	}


	public static int indexOfMax(Stack<Integer> stack)
	{
		if (stack.empty())
			return -1;

		Integer max = stack.peek();
		int indexOfMax = 0;
		int currentIndex = 0;
		Stack<Integer> tempStack = new Stack<>();

		while (!stack.empty())
		{
			Integer current = stack.pop();
			if (current > max)
			{
				max = current;
				indexOfMax = currentIndex;
			}
			tempStack.push(current);
			currentIndex++;

		}

		for (int i = 0; i < currentIndex; i++)
			stack.push(tempStack.pop());

		return indexOfMax;

	}

}
