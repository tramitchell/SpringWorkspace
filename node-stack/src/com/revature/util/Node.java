package com.revature.util;

public class Node<T>
{
	private T data;
	// points to the node below this node in the stack
	private Node<T> nodeBelow;
	// points to the node whose value is the minimum of all the nodes below this node (including itself) 
	private Node<T> minOfSubStack;
	// don't know how to make a Node point to itself
	
	public Node(T data, Node<T> nodeBelow, Node<T> minOfSubStack)
	{
		this.data = data;
		this.nodeBelow = nodeBelow;
		this.minOfSubStack = minOfSubStack;
	}
	

	// getters and setters
	public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
	
	
	public Node<T> getMinOfSubStack()
	{
		return minOfSubStack;
	}
	public void setMinOfSubStack(Node<T> minOfSubStack)
	{
		this.minOfSubStack = minOfSubStack;
	}
	
	
	public Node<T> getNodeBelow()
	{
		return nodeBelow;
	}
	public void setNodeBelow(Node<T> nodeBelow)
	{
		this.nodeBelow = nodeBelow;
	}
}
