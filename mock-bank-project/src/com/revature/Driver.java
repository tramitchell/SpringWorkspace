package com.revature;

import java.util.Scanner;
import com.revature.model.Bank;

public class Driver
{

	public static void main(String[] args)
	{
		// TODO close scanner
		Bank barclays = new Bank();
		Scanner inputScanner = new Scanner(System.in);
		
		char pound = '\u00a3';
		
		
		System.out.println
		(
			"Welcome to Barclay's" +
			"\nPlease Enter \t\"N\" to create a new account, or" +
			"\n\t\t\"L\" to log in to your account"
		);
		
		while(true)
		{
			switch(inputScanner.nextLine().toUpperCase())
			{
			
			case "N":
				// create new account
				// automatically login
				System.out.println("New username?");
				
				// TODO validate input
				String newUsername = inputScanner.nextLine();
				
				System.out.println("New password?");
				String newPassword = inputScanner.nextLine();
				
				barclays.addAccount(newUsername, newPassword);
				double balance = barclays.getUserBalance(newUsername);
				System.out.println
				(
					"***************************" +
					"\nWelcome, " + newUsername + "." +
					"\nYour balance is: " + balance + pound
				);
				
				
				// clear variables declared in case "n" ???
				break;
			case "L":
				// login and view balance
				// option to log off
				break;
				
			default:
				// println invalid
				// retry
			
				
				
			}
			
			
			
			
		}
	}

}
