package com.revature.util;

public class BinaryTree {
	private Node root;
	
	public void add(int value)
	{
		this.root = addRecursively(this.root, value);
		// ure.*
		
				
	}
	
	private Node addRecursively(Node currentNode, int value)
	{
		// if the node passed to the is nethod is null, return a new node containing the value
		if(currentNode == null)
		{
			System.out.println("the current node is null.");
			System.out.println("creating a new node to be added to the tree.");
			return new Node(value);
		}
		
		// if the value being addded is less thatn athe value of the current node,
		// recursively invoke the addrecursively mehtod to attempt to add a new value to the left child of the current node 
		if(value < currentNode.getData())
		{
			System.out.println("the new value is less than the curret nods's value");
			System.out.println("attempting to adda new value to the left child node.\n");
			
			currentNode.setLeftChild(addRecursively(currentNode.getLeftChild(), value));
		}
		
		else if(value > currentNode.getData())
		{
			System.out.println("the new value is greater than the curret nods's value");
			System.out.println("attempting to adda new value to the right child node.\n");
			
			currentNode.setRightChild(addRecursively(currentNode.getRightChild(), value));
		}
		
		// if the value being added is neither less r greater than the value of the current node
		// simply return the current node

		return currentNode;
	}
	
	public boolean containsValue(int value)
	{
		return containsValueRecursive(root, value);
	}
	
	private boolean containsValueRecursive(Node currentNode, int value)
	{
		// if current node is null hen the sought val is not stored in the tree so return false
		if(currentNode == null)
		{
			return false;
		}
		
		// if the value contained in the curent node is equal to the sought value treturn true
		if(currentNode.getData() == value)
			return true;
		
		// if sought value is less than the val stored in the current node, then we know
		// that we need to explore the nodes to the left of tthe current node, ditto right
		
		return 
				value < currentNode.getData() ? 
				containsValueRecursive(currentNode.getLeftChild(), value) :
				containsValueRecursive(currentNode.getRightChild(), value) ;
				
						
	}
	
	
	
	
	
	
	
	
	
	
}
