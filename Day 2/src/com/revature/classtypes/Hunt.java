package com.revature.classtypes;

public interface Hunt {
	/*
	 * special type of class that cannot be instantiated
	 * specifies what a class must do but not how it does it (abstraction)
	 * interfaces lack instance variables
	 * methods are declared without a body (abstract methods)
	 * since Java8 now they CAN be implemented in the interface
	 * all vars are implicitly public static final
	 * interfaces can extend each other, can have multiple parents
	 * 
	 */
	
	void findPrey();
	
	
	
}
