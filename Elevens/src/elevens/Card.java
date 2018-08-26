package elevens;

public class Card {
    private final String rank;
    private final String suit;
    private final int pointValue;
    
    public Card(String cardRank, String cardSuit, int cardPointValue){
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
    }
    
    public String suit(){
        return suit;
    }
    
    public String rank(){
        return rank;
    }
    
    public int pointValue(){
        return pointValue;
    }
    
    public boolean matches(Card otherCard){
        return (rank.equals(otherCard.rank())
                && suit.equals(otherCard.suit())
                && pointValue == otherCard.pointValue());
    }
    
    public String toString(){
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
