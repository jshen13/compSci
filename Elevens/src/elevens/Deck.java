package elevens;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Deck {
    private final List<Card> cards;
    private int size;
    
    public Deck(String[] ranks, String[] suits, int[] values){
        cards = new ArrayList<>();
        for(int i = 0; i < ranks.length; i++){
            for(String suit : suits){
                cards.add(new Card(ranks[i], suit, values[i]));
            }
        }
        size = cards.size();
        shuffle();
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
    public void shuffle(){
        Random rand = new Random();
        int r;
        Card temp;
        for(int k = cards.size()-1; k >= 1; k--){
            r = rand.nextInt(k+1);
            temp = cards.get(k);
            cards.set(k, cards.get(r));
            cards.set(r, temp);
        }
        size = cards.size();
    }
    
    public Card deal(){
        if(isEmpty()){
            return null;
        }
        else{
            size--;
            return cards.get(size);
        }
    }
    
    public String toString(){
        String rtn = "size = " + size + "\nUndealt cards: \n";
        for(int k = size - 1; k >= 0; k--){
            rtn += cards.get(k);
            if(k != 0){
                rtn += ", ";
            }
            if((size - k) % 2 == 0){
                rtn += "\n";
            }
        }
        rtn += "\nDealt cards: \n";
        for(int k = cards.size() - 1; k >= size; k--){
            rtn += cards.get(k);
            if(k != size){
                rtn += ", ";
            }
            if((k - cards.size()) % 2 == 0){
                rtn += "\n";
            }
        }
        rtn += "\n";
        return rtn;
    }
}
