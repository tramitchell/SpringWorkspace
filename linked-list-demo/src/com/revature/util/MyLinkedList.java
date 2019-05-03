package com.revature.util;

public class MyLinkedList<T> 
{
	// root node (the head)
	private Node<T> head;
	
	// end node (the tail)
	private Node<T> tail;
	
	// insert a node at the end of the linked list
	public void insert(T data)
	{
		// create a new node obj whose nextNode value is null,
		// and contains some data
		Node<T> newNode = new Node<>(data, null);
		
		// if the head of this linked list is null, then the new node will
		// become the head and the tail of this list
		if(this.head == null)
		{
			System.out.println("List is empty... adding first element");
			this.tail = this.head = newNode;
		}
		// set tail node's nextNode to point to the new node
		// set tail to point to new Node
		else
		{
			System.out.println("List has contents... adding new node to the tail of the list");
			this.tail.setNextNode(newNode);
			this.tail = newNode; 
			
		}
	}
	
	public void printList()
	{
		// start with the head of this list
		Node<T> currentNode = this.head;
		
		// while currentNode is not null, print out the node info and move on the the next node
		while(currentNode != null)
		{
			System.out.println("Node Value: " + currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}
	
	/*
	 * pop
	 * peek
	 * remove
	 * removeDuplicate
	 */
	
	public T peek()
	{
		// check if list is empty
		if(this.head == null)
		{
			System.out.println("empty list");
			return null;
		}
		else
			// return data in the head node
			return this.head.getData();
	}
	
	public T poll()
	{
		// check if empty list
		if(this.head == null)
		{
			System.out.println("empty list");
			return null;
		}
		else
		{
			// return the head node
			// head points to the 2nd node
			T returnData = this.head.getData();
			this.head = this.head.getNextNode();
			return returnData;
			
		}
	}
	
//	public T remove(int index)
//	{
//		if(this.head == null)
//		{
//			System.out.println("List is empty");
//			return null;
//		}
//		else
//		{
//			Node<T> runner = this.head;
//			for(int i = 0; i < index; i++)//
//			{
//				runner = runner.getNextNode();
//			}
//			T returnData = runner.getData();
//			this.hea = this.head.getNextNode();
//			return returnData;
//		}
//	}
	
	public boolean removeFirst(T data)
	{   // check if empty
		if(this.head == null)
		{
			System.out.println("empty list");
			return false;
		}
		else
		{
			Node<T> searcher = this.head;
			while(searcher != null)
			{
				if(searcher == searcher.getNextNode())
				searcher.getData().equals(data);
			}
		}
	}
	
	
	
}
