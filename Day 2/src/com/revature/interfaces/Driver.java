package com.revature.interfaces;

public class Driver {

	public static void main(String[] args) {
		
//		Dog scoobert = new Dog();
//		scoobert.speak();
//		scoobert.eat();
//		System.out.println("My owner is " + scoobert.getOwner());
		
		SavingsAccount s = new SavingsAccount();
		System.out.println(s.accountName);
		System.out.println(Bankable.interest(100, 2));
		
	}

}
