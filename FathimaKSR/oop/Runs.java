package oop;

public class Runs extends Laptop
{
	public void display()
	{
		System.out.println("Gonna purchase Intex mobile");
		super.display();
	}
	public static void main(String[] args) 
	{
		Runs run=new Runs();
		run.name="HP";run.display();
	}
}
class Laptop
{
	String name;
	public void display()
	{
		System.out.println("Gonna purchase: "+name);
	}
}