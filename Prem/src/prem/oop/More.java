package prem.oop;

public class More 
{
	int kevin;
	public void inquiry()
	{
		System.out.println("Inquiry about :"+kevin);
	}
	public static void main(String[] args) 
	{
		More mr=new More();mr.kevin=34000;mr.inquiry();
		Vacancy vac=new Vacancy();vac.see();
		Richard ric=new Richard();ric.react();
	}
}
class Vacancy
{
	public void see()
	{
		System.out.println("Seek for Java Programmer");
	}
}
class Richard
{
	public void react()
	{
		System.out.println("Listen");
	}
}