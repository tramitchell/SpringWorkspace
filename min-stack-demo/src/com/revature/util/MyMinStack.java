package com.revature.util;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MyMinStack {
	
	private int currentElementPosition = 0;
	private String[] elements;
	private PriorityQueue<String> sortedElements;
	
	
	public MyMinStack(int initialSize)
	{
		elements = new String[initialSize];
		sortedElements = new PriorityQueue<String>();

	}
	
	public void push(String newString)
	{
		// if the array is filled , expand its size
		if(currentElementPosition == elements.length) 
		{
			int increasedSize = elements.length * 2;
			elements = Arrays.copyOf(elements, increasedSize);
			
		}
		
		// check for new min value
		sortedElements.add(newString);
		
		// inserts new value
		elements[currentElementPosition++] = newString;
	}
	
	public String pop() 
	{
		// if current element position is zero then return null
		if(currentElementPosition == 0)
		{
			System.out.println("the stack is empty");
			return null;
			
		}
		
		// if the current element position is not 0, then return the next value in the stack
		// retrieve the top  most element
		String value = elements[--currentElementPosition];
		
		this.sortedElements.remove(value);
		
		// empty the element value
		elements[currentElementPosition] = null;
		
		return value;
		
	}
	
	public int size()
	{
		return currentElementPosition;
	}
	
	public String min()
	{
		if(currentElementPosition == 0)
			return null;
		return this.sortedElements.peek();
	}
	
	
}