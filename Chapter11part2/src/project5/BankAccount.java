package project5;

public abstract class BankAccount implements Account{
	private double amount;
	public double interestRate;
	public BankAccount(){
		amount = 0;
	}
	public void deposit(double m){
		amount += m;
	}
	public void withdraw(double m){
		amount -= m;
	}
	public double getBalance(){
		return amount;
	}
	public void setBalance(double m){
		amount = m;
	}
	
}
