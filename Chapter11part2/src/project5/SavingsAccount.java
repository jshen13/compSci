package project5;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(double iR){
		interestRate = iR;
	}
	public void withdraw(double m){
		super.withdraw(m);
		if (super.getBalance() < 0){
			super.setBalance(super.getBalance() * (1 + interestRate));
		}
	}
	public void deposit (double m){
		super.deposit(m);
		if (super.getBalance() < 0){
			super.setBalance(super.getBalance()* (1 + interestRate));
		}
	}
}
