package oop;

public class Differs extends Shawarma implements Fathima
{
	public static void main(String[] args) 
	{
		Differs d=new Differs();d.sideEffect="Cancer";
		System.out.println(d.sideEffect);d.sideEffect="FoodPoison";
		System.out.println(d.sideEffect);
		System.out.println(d.desire);d.seek();d.order();
	}
	@Override
	public void order() 
	{
		System.out.println("Fathima order FishFry for a change with: "+desire);
	}
}

class Shawarma
{
	String sideEffect;
	public void seek()// non abstract method
	{
		System.out.println("Shawarma provides taste also: "+sideEffect);
	}
}

interface Fathima
{
	String desire="Chicken";// final
	public void order();// abstract method
}