package cards;

import java.awt.List;
import java.util.*;
public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int size;
	public Deck (String [] ranks, String [] suits, int[] values){
		for(int i = 0; i < ranks.length; i++){
			cards.add(new Card(ranks[i], suits[i], values[i]));
		}
		size = cards.size();
	}
	public boolean isEmpty(){
		if (size == 0)
			return true;
		else 
			return false;
	}
	public int size(){
		return size;
	}
	public void shufflePerfect(){
		int mid = cards.size()/2;
		Card[] fHalf = new Card[mid];
		Card[] lHalf;
		if (cards.size()%2 == 0){
			lHalf = new Card[mid];
		} else {
			lHalf = new Card[mid+1];
		}
		for (int i = 0; i < 8; i++){//shuffle 8 times
			
			int index = 0;
			//put first half of cards into fhalf last into lhalf 
			for (int j = 0; j < cards.size(); j++){
				if (j < mid){
					fHalf[j] = cards.get(j);
					
				}else{ 
					lHalf[index] = cards.get(j);
					index++;
				}
			}
			int fCounter = 0;
			int lCounter = 0;
			for(int j = 0; j < cards.size(); j++){
				if (j % 2 == 0){
					cards.set(j, lHalf[lCounter]);
					lCounter++;
				}
				else{
					cards.set(j, fHalf[fCounter]);
					fCounter++;
				}
			}
			System.out.println(cards);

		}

	}
	public void shuffleRandom(){
		Random generator = new Random();
		int rand = generator.nextInt(size);
		int rand2 = generator.nextInt(size);
		Card temp;
		for (int i = 0; i <= size; i++){
			temp = cards.get(rand);
			temp = cards.set(rand2, temp);
			cards.set(rand, temp);
			rand = generator.nextInt(size);
			rand2 = generator.nextInt(size);
			
		}
		System.out.println(cards);
	}
	public Card deal(){
		if (size == 0)
			return null;
		else
			size--;
			return cards.get(size);
		
	}
	public String toString(){
		String rtn = "size = " + size + "\nUndealt cards: \n";
		
		for (int k = size - 1; k >= 0; k--){
			rtn += cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0){
				//insert carriage returns so entire deck is visible
				rtn += "\n";
			}
			
		}
		rtn += "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--){
			rtn += cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0){
				//insert carriage returns so entire deck is visible
				rtn += "\n";
			}
			
		}
		
		rtn += "\n";
		return rtn;
	}
}
