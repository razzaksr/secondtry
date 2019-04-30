package prem.oop;

/*
 * Constructor Overloading:
 * constructor is a special method it will called while
 * you creating an object itself
 * 
 * constructor should not have any returntype
 * 
 * to initialize the private variables/objects 
 * 
 * it should have name same as your classname
 * 
 * you may have more than one constructor for same class
 */

public class Cons 
{
	public static void main(String[] args) 
	{
		Digits dig=new Digits();dig.show();
		Digits digs=new Digits(12,90);digs.show();
	}
}
class Digits
{
	private int water, solid;
	public Digits()// default cons
	{
		System.out.println("Default constructor");water=1;solid=1;
	}
	public Digits(int a,int b)
	{
		System.out.println("Parameterized constructor");water=a;solid=b;
	}
	public void show()
	{
		System.out.println(water+" "+solid);
	}
}