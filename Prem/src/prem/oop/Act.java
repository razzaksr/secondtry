package prem.oop;

public class Act 
{
	public static void main(String[] args) 
	{
		Laptop lap1=new Laptop();
		lap1.model="Dell Vostro 1014";lap1.amount=34000;lap1.display();
		Laptop lap2=new Laptop();
		lap2.model="Acer";lap2.amount=24000;lap2.display();
		Laptop lap3=new Laptop();
		lap3.model="HPPavilion";lap3.amount=42000;lap3.display();
	}
}
class Laptop
{
	String model;int amount;
	public void display()
	{
		System.out.println(model+" "+amount);
	}
}