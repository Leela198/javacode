package day18;
/*Write a Java programming to create a banking system with
 *  three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. 
 *  Accounts should be an interface with methods to deposit, 
 * withdraw, calculate interest, and view balances.
 *  SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
 */

interface Accounts
{
	void deposit(double amount);
	void withdraw(double amount);
	void calculate_interest();
	void view_balance();
	
}
class SavingsAccount implements Accounts
{
private double balance;
private double interestRate;
SavingsAccount(double initialbal,float instrate)
{
	this.balance=initialbal;
	this.interestRate=instrate;
}

	@Override
	public void deposit(double amount) 
	{
		balance=balance+amount;
		System.out.println("amount after deposit in Savingsaccount is"+balance);
		
	}

	@Override
	public void withdraw(double amount) 
	{
		balance=balance-amount;
		System.out.println("balance after withdraw is"+balance);
		
	}

	@Override
	public void calculate_interest() 
	{
		balance += balance * interestRate / 100;
		System.out.println("quarterly interest rate after withdraw is"+balance);
		
	}

	@Override
	public void view_balance()
	{
		System.out.println("balance in Savings account"+balance);
		
	}
	
}

class CurrentAccount implements Accounts
{

	private double balance;
    private double interestRate;
	
	CurrentAccount(double inibal,double inrate)
	{
		this.balance=inibal;
		this.interestRate=inrate;
	}
	
	public void deposit(double amount) 
	{
		balance=balance+amount;
		System.out.println("amount after deposit in Savingsaccount is"+balance);
		
		
	}

	@Override
	public void withdraw(double amount)
	{
		
		balance=balance-amount;
		System.out.println("balance after withdraw is"+balance);
	}

	@Override
	public void calculate_interest()
	{
		balance += balance * interestRate / 100;
		System.out.println("amount after calu interest"+balance);
	}

	@Override
	public void view_balance() 
	{
		System.out.println("balance in Savings account"+balance);
		
	}
	
}

public class BankInterfaceDemo 
{

	public static void main(String[] args) 
	{
		SavingsAccount s1=new SavingsAccount(5000000,123.75f);
		CurrentAccount c1=new CurrentAccount(100000,234.567);
		s1.deposit(26798);
		s1.withdraw(45678);
		s1.calculate_interest();
		s1.view_balance();
		c1.deposit(67798);
		c1.withdraw(12000);
		c1.calculate_interest();
		c1.view_balance();

	}

}
