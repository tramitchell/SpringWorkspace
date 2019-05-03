package com.revature.interfaces;

public class Dog extends Wolf implements Domesticated {

	private String owner = "Tucker";
	
	
	public String getOwner() {
		return this.owner;
	}

	
	public void speak() {
		System.out.println("Bark! Bark!");
	}

}
