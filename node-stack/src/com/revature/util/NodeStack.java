package com.revature.util;

//import java.lang.Comparable;

public class NodeStack<T extends Comparable<T>>
{
	// points to the node at the top of the stack
	private Node<T> top ;

	public boolean isEmpty()
	{
		if (this.top == null)
			return true;
		return false;
	}

	public T peek()
	{
		// if empty return null
		if (this.top == null)
			return null;

		// otherwise return data from top node
		return this.top.getData();
	}

	public T pop()
	{
		// if empty return null
		if (this.top == null)
			return null;

		// otherwise, return data from the top node
		// make top point to the "second" node
		T returnData = this.top.getData();
		this.top = this.top.getNodeBelow();
		return returnData;

	}

//	public void push(T newData)
//	{
//		// if empty
//		if(this.top == null)
//		{
//			this.top = new Node<T>(newData, null, null);
//			return;
//		}
//		
//		// avoid null pointer
//		if (this.top.getMinOfSubStack() != null)
//		{
//			// if newData is the smallest of the stack
//			if (newData.compareTo(this.top.getMinOfSubStack().getData()) <= 0)
//			{
//				// then create new node
//				// point its minOfSubStack to itself
//				this.top = new Node<T>(newData, this.top, null);
//			}
//
//			else // newData is not min
//			{
//				// else create new node
//				// minOfSubstack unchanged
//				this.top = new Node<T>(newData, this.top, this.top.getMinOfSubStack());
//			}
//
//		} 
//		else 	// the old min of substack is the top node
//		{ 		
//			// if newData is the smallest of the stack
//			if (newData.compareTo(this.top.getData()) <= 0)
//			{
//				// then create new node
//				// point its minOfSubStack to itself
//				this.top = new Node<T>(newData, this.top, null);
//			}
//
//			else // newData is not min
//			{
//				// else create new node
//				// minOfSubstack unchanged
//				this.top = new Node<T>(newData, this.top, this.top);
//			}
//		}
//	}

	public T getMin()
	{
		if ( this.top.getMinOfSubStack() != null)
			return this.top.getMinOfSubStack().getData();
		return this.top.getData();
	}
	
	public void push(T newData)
	{
		// if empty
		if(this.top == null)
		{
			this.top = new Node<T>(newData, null, null);
			return;
		}
		
		// avoid null pointer
		if (this.top.getMinOfSubStack() != null)
		{
			// if newData is the smallest of the stack
			if (newData.compareTo(this.top.getMinOfSubStack().getData()) <= 0)
			{
				// then create new node
				// point its minOfSubStack to itself
				this.top = new Node<T>(newData, this.top, null);
			}

			else // newData is not min
			{
				// else create new node
				// minOfSubstack unchanged
				this.top = new Node<T>(newData, this.top, this.top.getMinOfSubStack());
			}

		} 
		else 	// the old min of substack is the top node
		{ 		
			// if newData is the smallest of the stack
			if (newData.compareTo(this.top.getData()) <= 0)
			{
				// then create new node
				// point its minOfSubStack to itself
				this.top = new Node<T>(newData, this.top, null);
			}

			else // newData is not min
			{
				// else create new node
				// minOfSubstack unchanged
				this.top = new Node<T>(newData, this.top, this.top);
			}
		}
	}


}
