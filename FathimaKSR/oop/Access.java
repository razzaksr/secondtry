package oop;

public class Access 
{
	int totalBalance;
	public static void main(String[] args) 
	{
		Account kamali=new Account();kamali.accNo=9876545678L;
		kamali.accBal=22000.0;
		Account kokila=new Account();kokila.accNo=4345675645L;
		kokila.accBal=88.0;
		kokila.add(300);kamali.display();
		kokila.display();
		Access fathima=new Access();
		fathima.totalBalance=(int)(kamali.accBal+kokila.accBal);
		System.out.println("Total balance: "+fathima.totalBalance);
	}
}
class Account
{
	long accNo;
	double accBal;
	public void add(int credit)
	{
		this.accBal+=credit;
		System.out.println("Amount "+credit+" added with "+this.accNo);
	}
	public void display()
	{
		System.out.println("Ur account details");
		System.out.println(this.accBal+" "+this.accNo);
	}
}