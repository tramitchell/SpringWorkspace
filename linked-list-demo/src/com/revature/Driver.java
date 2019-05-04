package com.revature;

import com.revature.util.MyLinkedList;

public class Driver 
{
	public static void main(String[] args) 
	{
		MyLinkedList<String> stringList = new MyLinkedList<>();

		
		/*
		 * Testing the removeDuplicates
		 */
//		for(int i = 0; i < 9; i++)
//			stringList.insert( ( new Integer((int) (Math.random() * 4)) ).toString() );
//		System.out.println("*****************************");
//		stringList.printList();
//		System.out.println("*****************************");
//		stringList.removeDuplicates();
//		System.out.println("*****************************");
//		stringList.printList();
		
		
		
		
		/*
		 * Testing the kthToLast()
		 */
//		for(int i = 0; i < 7; i++)
//			stringList.insert( ( new Integer((int) (Math.random() * 10)) ).toString() );
//		
//		stringList.printList();
//		System.out.println("*****************************");
//		System.out.println( stringList.kthToLast(2) );

		
		
		
		
		/*
		 * Testing isPalindrome()
		 */
		stringList.insert("n");
		stringList.insert("e");
		stringList.insert("v");
		stringList.insert("e");
		stringList.insert("r");
		stringList.insert("o");
		stringList.insert("d");
		stringList.insert("d");
		stringList.insert("o");
		stringList.insert("r");
		stringList.insert("e");
		stringList.insert("v");
		stringList.insert("e");
		stringList.insert("n");
		stringList.printList();
		System.out.println("*****************************");
		System.out.println( stringList.isPalindrome() );
		System.out.println("*****************************");
		MyLinkedList<String> s = new MyLinkedList<>();
		s.insert("l");
		s.insert("e");
		s.insert("v");
		s.insert("e");
		s.insert("l");
		s.printList();
		System.out.println( s.isPalindrome() );
		System.out.println("*****************************");
		MyLinkedList<String> t = new MyLinkedList<>();
		t.insert("1");
		t.insert("4");
		t.insert("5");
		t.printList();
		System.out.println( t.isPalindrome() );
		
	
	
	}
}
