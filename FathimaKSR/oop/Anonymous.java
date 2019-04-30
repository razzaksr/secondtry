package oop;

public class Anonymous 
{
	public static void main(String[] args) 
	{
		new IPL().status();
		new IPL().opinion();
		IPL ip=new IPL();ip.status();ip.opinion();
	}
}

class IPL
{
	public void status()
	{
		System.out.println("Worst game by fixing and gamling");
	}
	public void opinion(){System.out.println("Business marketting");}
}