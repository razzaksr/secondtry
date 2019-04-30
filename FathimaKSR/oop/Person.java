package oop;

public class Person 
{
	public static void main(String[] args) 
	{
		Card kamali=new Card();kamali.accNo=8765434567L;kamali.balance=22000;
		Appbank fathima=new Appbank();
		fathima.accNo=4567835644L;fathima.balance=7800.9;
		kamali.deposit(8000);kamali.statement();kamali.withdraw(300);
		kamali.statement();fathima.transfer(10000, "Kokila");
		fathima.statement();
	}
}
class Bank
{
	long accNo;double balance;
	public void statement()
	{
		System.out.println(accNo+" "+balance);
	}
}
class Card extends Bank
{
	public void deposit(int amt)
	{
		balance+=amt;System.out.println("Amount "+amt+" dedposited");
	}
	public void withdraw(int amt)
	{
		if(amt<=balance)
		{
			balance-=amt;System.out.println("Amount "+amt+" withdrawn ");
		}else{System.out.println("Insufficient balance");}
	}
}
class Appbank extends Bank
{
	public void transfer(int amt,String n)
	{
		if(amt<=balance)
		{
			balance-=amt;System.out.println("Amount "+amt+" transferred to"
					+n);
		}else{System.out.println("Insufficient balance");}
	}
}