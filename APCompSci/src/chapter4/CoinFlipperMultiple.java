package chapter4;
import java.util.Random;

// Project 4-06
public class CoinFlipperMultiple {
	public static void main (String []args){
		int heads = 0,tails = 0;
		Random generator = new Random();
		for (int i = 1; i < 11; i++) {
			int choice = generator.nextInt(2);
				if (choice == 0) {
					heads++;
				} else {
					tails++;
				}
		}
		System.out.println("You got tails " + tails + " times and heads " + heads + " times.");
		
		
	}
}
