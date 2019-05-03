package com.model;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Runner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Table myTable = new Table();

		myTable.dealToDealer();
		myTable.dealToPlayer();
		myTable.dealToPlayer();		
		
		myTable.printStatus();
		// check for blackjacks
		
		

		
		while(true)
		{
		
		
			switch(scan.nextLine().toUpperCase())
			{
			case "H":
	
				myTable.dealToPlayer();
				myTable.printStatus();
				
				if(myTable.playerHand.sum() > 21)
					System.out.println("bust"); // clear data? //deal new hand?
				
				else
				{
					System.out.println('?');
				}
				
				printLines(8);
				
				
				break;
			case "S":
				do
				{
					myTable.dealToDealer();
					delayFor(1000);
					myTable.printStatus();
					printLines(8);
				}
				while(myTable.dealerHand.sum() < 17);
				
				if(myTable.dealerHand.sum() > 21)
					System.out.println("You win");
				else	//pat hand
				{
					if(myTable.dealerHand.sum() > myTable.playerHand.sum())
						System.out.println("you lose");
					else if(myTable.dealerHand.sum() < myTable.playerHand.sum())
						System.out.println("you win");
					else
						System.out.println("push");

				}
				break;
			default:
				System.out.println("Please enter \'h\' or \'s\'");
				//////
			}
		
		}
		
		
		
		
		
//		
		
		
		
		
		
	}
	public static void printLines(int num)
	{
		for(int i = 0; i < num; i++)
			System.out.println();
	}
	
	public static void delayFor(int delay) 
	{
		try
		{
		    Thread.sleep(delay);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
	}

}
