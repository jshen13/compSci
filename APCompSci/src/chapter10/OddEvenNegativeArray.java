package chapter10;
import java.util.Scanner;

//Project 10-1
public class OddEvenNegativeArray {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int number, a = 0, b = 0, c = 0;
		int [] oddList = new int [10];
		int [] evenList = new int [10];
		int [] negativeList = new int [10];
		for (int i = 1; i < 11; i++){
			System.out.print("Input your number (" + i + "): ");
			number = scan.nextInt();
			if (number < 0){
				negativeList [a] = number;
				a++;
			} else if (number % 2 == 0){
				evenList [b] = number;
				b++;
			} else {
				oddList [c] = number;
				c++;
			}
		}
		System.out.print("Odd List: ");
		for (int i = 0; i < c; i++ ){
			System.out.print(oddList[i] + "  ");
		}
		System.out.print("\nEven List: ");
		for (int i = 0; i < b; i++ ){
			System.out.print(evenList[i] + "  ");
		}
		System.out.print("\nNegative List: ");
		for (int i = 0; i < a; i++ ){
			System.out.print(negativeList[i] + "  ");
		}
	}
}
