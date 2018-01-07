package chapter4;
import java.util.Scanner;

public class PhoneCallPrice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the minutes of the call to Lexington, Virginia: ");
		int minutes = scan.nextInt();
		if (minutes <= 2){
			System.out.println("The call cost $1.15");
		} else {
			int additional = minutes-2;
			double price = additional*0.5 + 1.15;
			System.out.println("The call cost $" + price);
			
		}
		
	}
}
