package prem.oop;

// multi level 

public class App extends Debitcard
{
	public void transfer(int amt)
	{
		if(amt<=balance)
		{
			balance=balance-amt;
			System.out.println("Amount gonna be tranferred as IMPS "+amt);
		}
		else
		{
			System.out.println("Amount can't tranferred");
		}
	}
	public static void main(String[] args) 
	{
		App ap=new App();
		ap.balance=9000.45;ap.deposit(3400);ap.transfer(8000);ap.statement();
	}
}
class Account
{
	double balance;
	public void statement()
	{
		System.out.println("Your account balance is: "+balance);
	}
}
class Debitcard extends Account
{
	public void deposit(int amt)
	{
		balance=balance+amt;
		System.out.println("Amount gonna be deposited to your account: "+amt);
	}
}