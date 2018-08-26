package cards;

public class Card {
	private String suit;
	private String rank;
	private int pointValue;
	public Card (String cardRank, String cardSuit, int cardPointValue){
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
		
	}
	public String suit(){
		return "Suit: " + suit;
	}
	public String rank(){
		return "Rank: " + rank;
	}
	public int pointValue(){
		return pointValue;
	}
	public boolean matches (Card otherCard){
		if (otherCard.suit.equalsIgnoreCase(suit) && otherCard.rank.equalsIgnoreCase(rank)
				&& otherCard.pointValue == pointValue)
			return true;
		else 
			return false;
	}
	public String toString(){
		return rank + " of " + suit + " (point value = " + pointValue + ")" ;
	}
}
