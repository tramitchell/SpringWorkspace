package com.revature.util;

import java.util.ArrayList;

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
			//System.out.println("List is empty... adding first element");
			this.tail = this.head = newNode;
		}
		// set tail node's nextNode to point to the new node
		// set tail to point to new Node
		else
		{
			//System.out.println("List has contents... adding new node to the tail of the list");
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
			T firstNodeData = this.head.getData();
			this.head = this.head.getNextNode();
			return firstNodeData;
			
		}
	}
	
	public boolean removeByKey(T key)
	{
		if(this.head == null)
			return false;
		// create a reference to hold our current node
		Node<T> currentNode = this.head;
		
		// create  reference to hold the next node after the current node
		Node<T> nextNode = currentNode.getNextNode();
		
		// if the currentNode has the data   we want to delete , move the head to the next node
		if(currentNode.getData().equals(key))
		{
			this.head = nextNode;
			return true;
		}
		// iterate across the linked list while currentNode is not null
		while(currentNode != null)
		{
			/* 
			 * If the next NOde is not null and contains the data we want to delete 
			 * have the currenNode point to the node after tnextNode and return true
			 */
			
			if(nextNode != null && nextNode.getData().equals(key))
			{
				currentNode.setNextNode(nextNode.getNextNode());
				return true;
			}
			// advance currentNode to the next node in the list
			currentNode = currentNode.getNextNode();
			
			// if nextNode is not null, then advance the next node to the one after it
			if(nextNode != null)
				nextNode = nextNode.getNextNode();
			
			
		}
		return false;
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
//			// runner runs to the node just prior to the specified index
//			Node<T> runner = this.head;
//			// remove last node test case
//			for(int i = 0; i < index - 1 || runner.getNextNode() == null; i++)
//			{
//				runner = runner.getNextNode();
//			}
//			
//			T returnData = runner.getNextNode().getData();
//			runner.setNextNode(runner.getNextNode().getNextNode());
//			return returnData;
//		}
//	}
	
	
	
	
//	public boolean removeFirst(T data)
//	{   // check if empty
//		if(this.head == null)
//		{
//			System.out.println("empty list");
//			return false;
//		}
//		else
//		{
//			Node<T> searcher = this.head;
//			while(searcher != null)
//			{
//				if(searcher == searcher.getNextNode())
//				searcher.getData().equals(data);
//			}
//		}
//	}
	
	
	public void removeDuplicates() 
	{
		if(this.head == null)
			return;
		Node<T> targetNode = this.head; 
		
		while(targetNode != null)
		{
			Node<T> currentNode = targetNode;
			Node<T> nextNode = currentNode.getNextNode();
			// iterate thru remainder of list
			// and remove any duplicates of the target node
			
			while(nextNode != null) 
			{
				// if duplicate found
				if( nextNode.getData().equals(targetNode.getData()) )
				{
					// remove duplicate
					// keep current node the same
					// move nextNode to the next node
					// System.out.println("Removing " + nextNode.getData());
					currentNode.setNextNode( nextNode.getNextNode() );
					nextNode = nextNode.getNextNode();
				}
				else
				{
					// increment currentNode and nextNode
					currentNode = currentNode.getNextNode();
					nextNode = nextNode.getNextNode();
				}
			}
			targetNode = targetNode.getNextNode();
		}
	}
	
	public T kthToLast(int k)
	{
		// check if empty or invalid input
		if(this.head == null || k < 1)
			return null;
		
		// temp pointer to iterate thru linkedList
		Node<T> currentNode = this.head;
		int size = 0;
		
		// iterate thru the LinkedList
		// counting the number of elements
		while(currentNode != null) 
		{
			size++;
			currentNode = currentNode.getNextNode();
		}
		
		// check for invalid input
		if( k > size)
			return null;
		
		// start at the beginning
		currentNode = this.head;

		// iterate thru the linked list
		// until current node reaches the desired element
		for(int i = 0; i < size - k; i++)
		{
			currentNode = currentNode.getNextNode();			
		}
		
		// return what the current node landed on
		return currentNode.getData();
	}
	
	public boolean isPalindrome()
	{
		if (this.head == null)
			return true;
		
		Node<T> iterator = this.head;
		ArrayList<T> storedList = new ArrayList<>();
		ArrayList<T> reversedStorage = new ArrayList<>();
		while(iterator != null)
		{
			storedList.add(iterator.getData() );
			iterator = iterator.getNextNode();
		}
		// poll in loop?
		
		for(int i = storedList.size() - 1; i >= 0; i--)
		{
			reversedStorage.add(storedList.get(i));
		}
		
		if(reversedStorage.equals(storedList))
			return true;
		return false;
		
	}
	
	public int size()
	{
		// check if empty or invalid input
		if(this.head == null)
			return 0;
		
		// temp pointer to iterate thru linkedList
		Node<T> currentNode = this.head;
		int size = 0;
		
		// iterate thru the LinkedList
		// counting the number of elements
		while(currentNode != null) 
		{
			size++;
			currentNode = currentNode.getNextNode();
		}
		return size;
	}
	
	
	
	
}
