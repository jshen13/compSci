package chapter4;
import java.util.Scanner;

//Project 4-7
public class PowersOfTwo {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the exponent on the base 2 (Enter -1 to terminate program): ");
		int exponent = scan.nextInt();
		while (exponent != -1) {
			double answer = Math.pow(2, exponent);
			System.out.println("The answer is " + answer);
			System.out.print("Input the exponent on the base 2 (Enter -1 to terminate the program): ");
			exponent = scan.nextInt();
		} 
		if (exponent == -1) {
			System.out.println("Program terminated.");
		}
		
	}
}
