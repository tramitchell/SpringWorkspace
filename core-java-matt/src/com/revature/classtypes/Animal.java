package com.revature.classtypes;

public abstract class Animal {
	/*
	 * Special type of class that cannot be instantiated
	   
	 * can contain concrete methods
	 * "contract based"- abstract methods MUST be overridden in a subclass 
	 */
	public void doSomething() {}
	public abstract void breathe();
}
