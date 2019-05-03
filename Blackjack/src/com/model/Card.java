package com.model;

public class Card {
	public Suit suit;
	public Face face;

	public Card(Suit suit, Face face) {
		this.suit = suit;
		this.face = face;
	}
	
	public void printCard() {
		switch(this.face) {
		case TWO:
			System.out.print("|2|");
			break;
		case THREE:
			System.out.print("|3|");
			break;
		case FOUR:
			System.out.print("|4|");
			break;
		case FIVE:
			System.out.print("|5|");
			break;
		case SIX:
			System.out.print("|6|");
			break;
		case SEVEN:
			System.out.print("|7|");
			break;
		case EIGHT:
			System.out.print("|8|");
			break;
		case NINE:
			System.out.print("|9|");
			break;
		case TEN:
			System.out.print("|T|");
			break;
		case JACK:
			System.out.print("|J|");
			break;
		case QUEEN:
			System.out.print("|Q|");
			break;
		case KING:
			System.out.print("|K|");
			break;
		case ACE:
			System.out.print("|A|");
			break;
		default:
			System.out.print("|?|");
		}
	}
}
