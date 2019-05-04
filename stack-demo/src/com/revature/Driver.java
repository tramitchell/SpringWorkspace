package com.revature;

import com.revature.util.MyStack;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack myStack = new MyStack(10);
		
		myStack.push("hello!");
		myStack.push("goodbye");
		myStack.push("abc");
		myStack.push("xyz");
		myStack.push("123");
		myStack.push("----");
		myStack.push("stop");
		
		System.out.println(myStack.size());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());

		System.out.println(myStack.size());
	}

}
