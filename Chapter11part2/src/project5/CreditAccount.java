package project5;

public class CreditAccount extends BankAccount{
	public double creditLine;
	public CreditAccount(double iR, double cL){
		interestRate = iR;
		creditLine = cL;
	}
	public void withdraw(double m){
		if (super.getBalance() - m < creditLine)
			System.out.println("You are unable to make this transaction.");
		else{
			super.withdraw(m);
			if (super.getBalance() < 0){
				super.setBalance(super.getBalance() * (1 + interestRate));
			}
		}
	}
	public void deposit (double m){
		super.deposit(m);
		if (super.getBalance() < 0){
			super.setBalance(super.getBalance() * (1 + interestRate));
		}
	}
	
	
}
