package com.revature.interfaces;

import java.util.LinkedList;

public class SavingsAccount extends Account {
	int withdrawLimit;
	static int numAccounts = 0;
	static LinkedList<String> accountList = new LinkedList<String>();
	
	public SavingsAccount() 
	{
		super();
		numAccounts++;
		accountList.add(new Integer(numAccounts).toString());
	}
	
}
