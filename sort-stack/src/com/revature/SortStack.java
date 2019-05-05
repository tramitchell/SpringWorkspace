package com.revature;

import java.util.Stack;

public class SortStack
{
	static Stack<Integer> testStack = new Stack<>();

	public static void main(String[] args)
	{
		// populate stack
		testStack.push(5);
		testStack.push(10);
		testStack.push(9);
		testStack.push(2);
		testStack.push(9);
		testStack.push(12);
		testStack.push(-2);
		testStack.push(15);
		testStack.push(6);
		testStack.push(3);
		
		// sort stack
		sort(testStack);
		
		// display stack
		while(!testStack.empty())
			System.out.println(testStack.pop());

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
		testStack = sortedStack;
	}

	// find the index of the max value of the stack
	// zero-indexed
	// works by popping data into a temporary stack,
	// comparing each datum to the largest found so far,
	// and then pushing everything back into the original
	public static int indexOfMax(Stack<Integer> stack)
	{
		if (stack.empty())
			return -1;

		// initialize all variables
		// max will hold the maximum value that has been found so far
		Integer max = stack.peek();
		// index of the maximum value that has been found so far
		int indexOfMax = 0;
		// currentIndex will increment once per loop
		// just to keep track of the size of the stack
		int currentIndex = 0;
		// temp stack will be filled with the content of parameter stack
		Stack<Integer> tempStack = new Stack<>();

		// loop while the stack still has contents
		// once loop is finished all contents will be in tempStack
		while (!stack.empty())
		{
			// get the value at the top of the stack
			Integer current = stack.pop();
			
			// compare the current item to the maximum so far
			if (current > max)
			{
				// if a larger value is found
				// update max with that larger value
				// update index as well
				max = current;
				indexOfMax = currentIndex;
			}
			// store datum in tempStack
			// increment index
			tempStack.push(current);
			currentIndex++;

		}
		
		// take stored values and put everything back into the original
		for (int i = 0; i < currentIndex; i++)
			stack.push(tempStack.pop());

		return indexOfMax;

	}

}
