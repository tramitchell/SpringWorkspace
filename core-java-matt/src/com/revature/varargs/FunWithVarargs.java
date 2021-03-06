package com.revature.varargs;

public class FunWithVarargs {
	//Var args- variable length arguments
	//a method that will take a variable number of arguments
	// must be the last argument
	//can be any type
	public static void main(String[] args) {
		System.out.println("**********************************");
		vaTest("a string", 6,3,8,9);
	}
	
	public static void vaTest(String s, int ... v) {// the ... is how we declare  a var args
		//Automates and hides the process of creating and saving the values into an array
		//prior to invoking the method
		System.out.println("Number of arguments is: " + (1+v.length) + "\nContents: ");
		System.out.println(s);
		for(int x: v)
			System.out.println(x);
	}
}
