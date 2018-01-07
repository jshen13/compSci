package chapter7;
import java.util.Scanner;

//Project 7-8 
public class SentenceStats {
	public static void main (String []args){
		Scanner scan = new Scanner(System.in);
		int words = 0, length = 0; 
		double avgLength = 0.0;
		System.out.print("Input a sentence: ");
		String str = scan.nextLine();
		Scanner string1 = new Scanner(str);
		while (string1.hasNext()){
			words++;
			String word = string1.next();
			length +=  word.length();
		}
		avgLength = (double)length/words;
		System.out.println("There are " + words + " words in the sentence. "
					 	 + "\nThe average length of each word is "
					 	 + "" + avgLength + ". "
					 	 + "\nThe length of the sentence is " + str.length() + ".");
	}
}
