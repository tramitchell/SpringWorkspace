package com.model;

public class Table {
	Hand playerHand;
	Hand dealerHand;
	Deck theDeck;
	
	public Table() {
		this.playerHand = new Hand();
		this.dealerHand = new Hand();
		this.theDeck = new Deck();
		
	}
	
	public void dealToPlayer() {
		this.playerHand.add(theDeck.dealCard());
	}
	
	public void dealToDealer() {
		this.dealerHand.add(theDeck.dealCard());
	}
	
	public void printStatus() {
		System.out.print("Dealer: ");
		dealerHand.printHand();
		System.out.print("\nYou: ");
		playerHand.printHand();
		System.out.println("\n?");
	}
}
