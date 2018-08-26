package project5;

public class BankAccountMain {
	public static void main (String[] args){
		SavingsAccount mySavings = new SavingsAccount (0.05);
		CreditAccount myCredit = new CreditAccount (0.03, -10);
		CheckingAccount myChecking = new CheckingAccount();
		mySavings.withdraw(100);
		System.out.println(mySavings.getBalance());
		mySavings.deposit(50);
		System.out.println(mySavings.getBalance());
		mySavings.deposit(100);
		System.out.println(mySavings.getBalance());
		myCredit.withdraw(8);
		System.out.println(myCredit.getBalance());
		myCredit.withdraw(5);
		System.out.println(myCredit.getBalance());
		myCredit.deposit(100);
		System.out.println(myCredit.getBalance());
		myChecking.withdraw(100);
		System.out.println(myChecking.getBalance());
		myChecking.deposit(200);
		System.out.println(myChecking.getBalance());

	}
}
