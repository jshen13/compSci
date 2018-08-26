package cards;

public class CardMain {
	public static void main (String [] args){
		Card aceSpades = new Card("A", "Spade", 14);
		Card aceSpades2 = new Card("A", "Spade", 14);
		Card twoDiamond = new Card("2", "Diamond", 2);
		System.out.println(aceSpades.matches(aceSpades2));
		System.out.println(aceSpades.matches(twoDiamond));
		System.out.println(twoDiamond.rank() + "\n" + twoDiamond.suit() + " \n" + twoDiamond.pointValue());
		System.out.println(aceSpades);
		System.out.println(aceSpades2);
		System.out.println(twoDiamond);
	}
}
