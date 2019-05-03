package com.revature.util;

public class Node<T> 
{
	private T data;
	private Node<T> nextNode;
	
	public Node(T data, Node<T> nextNode)
	{
		super();
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public T getData()
	{
		return this.data;
	}
	public void setData(T newData)
	{
		this.data = newData;
	}
	
	public Node<T> getNextNode() 
	{
		return this.nextNode;
	}
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode = nextNode;
	}
}
