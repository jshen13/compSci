package chapter7;

import java.util.Random;
import java.util.Scanner;

//Project 7-1
public class GuessingGameUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		int num = generator.nextInt(100) + 1;
		int guess;
		int guesses = 1;
		System.out.println("Guessing Game");
		System.out.print("Guess the number between 1-100: ");
		guess = scan.nextInt();
		while (true) {
			if (guess < 1 || guess > 100) {
				System.out.println("Input a number from 1-100.");
				break;
			}
			if (guess < num) {
				System.out.println("No, the number is more");
			} else if (guess > num) {
				System.out.println("No, the number is less");
			} else {
				break;
			}
			System.out.print("Guess another number between 1-100: ");
			guess = scan.nextInt();
			guesses++;
		}
		System.out.println("The number was " + num + ". You took " + guesses + " guesses.");

	}
}
