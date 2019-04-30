package oop;

public class InsideMethod 
{
	public static void main(String[] args) 
	{
		Software soft=new Software();soft.client="Central Govt";
		soft.info();
	}
}
class Software
{
	String client;
	public void info()
	{
		String technology;
		class Project
		{
			int teamCount;
			public void details(){System.out.println(teamCount);}
		}
		Project pro=new Project();pro.teamCount=30;pro.details();
	}
}