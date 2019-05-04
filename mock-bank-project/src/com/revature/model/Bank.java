package com.revature.model;

import java.util.HashMap;
import java.util.Set;

public class Bank
{
	// constructor?
	HashMap<String, Account> ledger;
	HashMap<String, String> userData;

	public Bank()
	{
		this.ledger = new HashMap<String, Account>();
		this.userData = new HashMap<String, String>();
	}

	// TODO validate username and acccount
	// avoid repeats
	// update password
	// add multiple accounts to user's profile
	public void addAccount(String username, String password)
	{
		this.ledger.put(username, new Account());
		this.userData.put(username, password);
	}

	public double getUserBalance(String username)
	{
		Set<String> usernameSet = this.ledger.keySet();
		for (String u1 : usernameSet)
		{
			if (u1.equals(username))
			{
				Set<String> username
				for (String u2:)
			}
		}
	}
}