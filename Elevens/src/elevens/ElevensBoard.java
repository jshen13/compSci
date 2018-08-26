package elevens;

import java.util.List;

public class ElevensBoard extends Board{
    private static final int BOARD_SIZE = 9;
    private static final String[] RANKS = {"ace", "2", "3", "4", "5", "6",
        "7", "8", "9", "10", "jack", "queen", "king"};
    private static final String[] SUITS = {"spades", "hearts", "diamonds", "clubs"};
    private static final int[] POINT_VALUES = {1,2,3,4,5,6,7,8,9,10,0,0,0};
    
    public ElevensBoard(){
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }
    
    public boolean isLegal(List<Integer> selectedCards) {
        if (selectedCards.size() == 2) {
            return containsPairSum11(selectedCards);
        } 
        else if (selectedCards.size() == 3) {
            return containsJQK(selectedCards);
        } 
        else {
            return false;
        }
    }

    public boolean anotherPlayIsPossible() {
        List<Integer> selectedCards = cardIndexes();
	return containsPairSum11(selectedCards) || containsJQK(selectedCards);
    }
    
    private boolean containsPairSum11(List<Integer> selectedCards){
        for(int i = 0; i < selectedCards.size(); i++){
            for(int k = 0; k < selectedCards.size(); k++){
                if((i != k) && ((cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(k)).pointValue()) == 11)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean containsJQK(List<Integer> selectedCards){
        boolean kingFound = false, queenFound = false, jackFound = false;
        for(int i = 0; i < selectedCards.size(); i++){
            if(cardAt(selectedCards.get(i)).rank().equals("jack")){
                jackFound = true;
            }
            if(cardAt(selectedCards.get(i)).rank().equals("queen")){
                queenFound = true;
            }
            if(cardAt(selectedCards.get(i)).rank().equals("king")){
                kingFound = true;
            }
        }
        if(jackFound && queenFound && kingFound){
            return true;
        }
        return false;
    }
}
