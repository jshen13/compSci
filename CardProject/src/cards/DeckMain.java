package cards;

public class DeckMain {
	public static void main (String [] args){
		String[] suit = {"Diamond", "Spade", "Heart", "Diamond", "Club", "Spade", "Heart"};
		String[] rank = {"3", "A", "8", "J", "6", "K", "4"};
		int[] pointValue = {3, 14, 6, 14, 6, 14, 3};
		Deck myDeck = new Deck(rank, suit, pointValue);
		System.out.println(myDeck);
		myDeck.shuffleRandom();
		System.out.println("Shuffle perfect");
		myDeck.shufflePerfect();
		System.out.println(myDeck);
		while(!myDeck.isEmpty()){
			myDeck.deal();
			System.out.println(myDeck);
		};
		
	}
}
