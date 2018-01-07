package chapter8;
import java.util.Scanner;
import java.io.*;

//Project 8-3
public class AmountfromInterestCalculator {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		double interestRate, principal, amount, gain;
		int years;
		System.out.print("Input the interest rate: ");
		interestRate = scan.nextDouble();
		System.out.print("Input the initial Principal: ");
		principal = scan.nextDouble();
		System.out.print("Input years you want to stay in the fund(at least 1 year): ");
		years = scan.nextInt();
		System.out.println("\n|Year |Principle |Interest Earned |Principle(end of year) |");
		
		/*for( int i = 1; i <= years; i++){
		amount = principal*Math.pow(1 + (interestRate/400),4);
		gain = amount - principal;
		System.out.printf("|%4d |%9.2f |%15.2f |%22.2f |%n", i, principal, gain, amount );
		principal = amount;
		}*/
		amount = principal;
		for( int i = 1; i <= years; i++){
			for (int j = 1; j <= 4; j++){
				amount = amount*(1 + interestRate / 400);
			}
			gain = amount - principal;
			System.out.printf("|%4d |%9.2f |%15.2f |%22.2f |%n", i, principal, gain, amount );
			principal = amount;
		}
			
		
		
		
		
		
		
		
		
		
		
	}
}
