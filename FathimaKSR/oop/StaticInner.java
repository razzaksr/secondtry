package oop;


public class StaticInner 
{
	public static void main(String[] args) 
	{
		Fest f=new Fest();f.eventName="PPT";Fest.winner="Mahesh";
		f.showAll();
		Fest.Coordinate co=new Fest.Coordinate();
		co.report();
	}
}
class Fest
{
	String eventName;
	static String winner;
	public void showAll()
	{System.out.println(eventName+" and winner is: "+winner);}
	static class Coordinate
	{
		public void report()
		{
			System.out.println("Cordinator conducting event: "+winner);
		}
	}
}