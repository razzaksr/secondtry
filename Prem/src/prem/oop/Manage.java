package prem.oop;

// multiple inheritance: via interface

public class Manage extends Source implements Remote
{
	public static void main(String[] args) 
	{
		Manage man=new Manage();man.geek();man.beginner();
	}

	@Override
	public void beginner() 
	{
		System.out.println("Beginner should learn basics");
	}
}
class Source
{
	public void geek()
	{
		System.out.println("Geek's practice well");
	}
}
interface Remote
{
	public void beginner();// abstract method
}