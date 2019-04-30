package oop;

public class CompileTime 
{
	public static void main(String[] args) 
	{
		ATM kokila=new ATM(870.4);
		kokila.recharge(9876543210L, 499);
		kokila.recharge(8765738, 120);
		kokila.recharge(8765456732L, 250, "BSNL");
	}
}
class ATM
{
	private double balance;
	public ATM(){}
	public ATM(double a){balance=a;}
	public void recharge(long mob,int amt,String network)
	{
		if(balance>=amt)
		{
			if(network=="BSNL")
			{balance-=(amt-50);System.out.println("50 rs redeemed");}
			else
			{balance-=amt;}
			System.out.println(mob+" mobile recharged with "+amt);
		}
		else
		{System.out.println(mob+" mobile cannot recharged with "+amt);}
	}
	public void recharge(long mob,int amt)
	{
		if(balance>=amt)
		{
			balance-=amt;
			System.out.println(mob+" mobile recharged with "+amt);
		}
		else
		{System.out.println(mob+" mobile cannot recharged with "+amt);}
	}
	public void recharge(int dth, int amt)
	{
		if(balance>=amt)
		{
			balance-=amt;
			System.out.println(dth+" DTH recharged with "+amt);
		}
		else
		{System.out.println(dth+" DTH cannot recharged with "+amt);}
	}
}