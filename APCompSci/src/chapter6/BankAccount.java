package chapter6;
//6-5
public class BankAccount {
	
	private String name;
	private double balance;
	public BankAccount(){
		name = "";
		balance = 0.0;
	}
	public void setName(String nm){
		name = nm;
	}
	public void setBalance(double bal){
		balance = bal;
	}
	public String getName(){
		return name;
	}
	public double getBalance(){
		return balance;
	}
	public double deposit(double depo){
		balance += depo;
		return balance;
	}
	public double withdraw(double wd){
		balance -= wd;
		return balance;
	}
	public String toString(){
		String str;
		str = "Owner's name: " + name + "\n" +
			  "Account balance: $" + balance;
		return str;
	}
	
}
