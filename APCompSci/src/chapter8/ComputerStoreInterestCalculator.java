package chapter8;
import java.util.Scanner;

//Project 8-4
public class ComputerStoreInterestCalculator {
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		double payment, balance, interest = 0, balanceAfter = 0, downpayment;
		System.out.print("Enter the purchase price of the computer: ");
		double price = scan.nextDouble();
		downpayment = price * 0.10;
		price -= downpayment;
		balance = price;
		
		System.out.printf("Downpayment: $%.2f %n", downpayment);
		System.out.println("Month |Total balance owed |Interest owed |Month:Princpal owed |Month:Payment |Balance after payment |");
		double principal;
		int month = 1;
		while (true){
				interest = balance * 0.12 / 12;
				payment = price * 0.05;
				principal = payment - interest;
				balanceAfter = balance - principal;
				if (balanceAfter < 0){
					principal += balanceAfter;
					balanceAfter = 0;
					payment = interest + principal;
				}
				System.out.printf("%5d |%18.2f |%13.2f |%19.2f |%13.2f |%21.2f |%n", 
						month, balance, interest, principal, payment, balanceAfter);
				balance = balanceAfter;
				month++;
				if (balance <= 0.0049)
					break;
			}
			
		}
		
}
