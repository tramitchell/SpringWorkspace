package com.revature.model;

public class Account
{
	double balance;
	
	Account()
	{
		this.balance = 0;
	}
	
	// TODO handle fractions of a cent
	// add comments
	boolean deposit(double amount)
	{
		if(amount < 0)
			return false;
		
		this.balance += amount;
		return true;
	}
	
	boolean withdraw(double amount)
	{
		if(amount > this.balance || amount < 0)
			return false;
		
		this.balance -= amount;
		return true;
	}
	
	double getBalance()
	{
		return this.balance;
	}
	
}
