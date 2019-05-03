package com.revature.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// Create arrayList
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("C");
		a1.add("D");
		a1.add("E");
		a1.add("A");
		a1.add("H");
		a1.add("B");
		a1.add("G");
		a1.add("F");
		
		// USE ITERATOR to display
		System.out.println("original contents of a1: ");
		Iterator<String> itr = a1.iterator(); 
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + "  ");
		}
		
		
		//modify elements being iterated
		//cannot modify elements with Iterator, have to use ListIterator
		ListIterator<String> litr = a1.listIterator();
		while(litr.hasNext())
		{
			String element = litr.next();
			litr.set(element + '+');
		}
		//print contents
		System.out.println("\nModified Contents of a1: ");
		
		/////////////
		itr = a1.iterator(); 
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + ' ');
		}
		
		
		//Display list backwards
		System.out.println("\nModified contents backwards: ");
		while(litr.hasPrevious())
		{
			String element = litr.previous();
			System.out.print(element + " ");
		}
		
		System.out.println("\nUsing for each loop: ");
		for(String s: a1)
			System.out.print(s + " ");
		
		
		
	}

}
