package com.revature.interfaces;

public abstract class Account implements Bankable {

	String accountName;
	double balance;
	
	public Account()
	{
		this.balance = 42;
		this.accountName = "Tucker";
	}
	
	public void deposit(int amt) 
	{
		this.balance += amt;
	}
}
