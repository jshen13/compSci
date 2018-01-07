package chapter6;
import java.util.Scanner;
//6-5
public class BankAccountMain {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		BankAccount user = new BankAccount();
		int action = 0;
		double d = 0, wd = 0;
		user.getBalance();
		user.getName();
		System.out.print("What is the owner's name: ");
		String owner = scan.nextLine();
		System.out.print("What is the account balance: ");
		double account = scan.nextDouble();
		user.setName(owner);
		user.setBalance(account);
		while (true) {
			System.out.print("What do you want to do? Deposit (1), Withdraw (2), see balance (3). Press -1 to terminate program.  ");
			action = scan.nextInt();
			if (action == -1){
				System.out.println("Program terminated.");
				break;
			} else if (action ==1){
				System.out.print("How much do you want to deposit? ");
				d = scan.nextDouble();
				user.deposit(d);
				System.out.println("Your balance is now $" + user.getBalance());
			} else if (action == 2){
				System.out.print("How much do you want to withdraw? ");
				wd = scan.nextDouble();
				user.withdraw(wd);
				System.out.println("Your balance is now $" + user.getBalance());
			} else if (action == 3){
				System.out.println(user);
			}
		}

	}
}
