package chapter4;
import java.util.Random;

public class CoinFlipping {
	public static void main(String[] args) {
		Random generator = new Random();
		System.out.println("Coin Flipping Simulator");
		int side = generator.nextInt(2);
		if (side == 0) {
			System.out.println("You got Heads!");
		} else {
			System.out.println("You got Tails!");
		}
		
		
		
		
	}
}
