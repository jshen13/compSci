package chapter4;
import java.util.Scanner;

public class QuotientWithRemainder {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int num1 = scan.nextInt();
		System.out.println("Input second integer: ");
		int num2 = scan.nextInt();
		if (num1 > num2) {
			int dividend = num1;
			int divisor = num2;
			int quotient = dividend/divisor;
			int remainder = dividend%divisor;
			System.out.println("The answer is: " + quotient + "r. " + remainder);
		} else if ( num2 > num1) {
			int dividend = num2;
			int divisor = num1;
			int quotient = dividend/divisor;
			int remainder = dividend%divisor;
			System.out.println("The answer is: " + quotient + "r. " + remainder);
		} else {
			System.out.println("The answer is: 1r.0");
		}
		
	}
}
