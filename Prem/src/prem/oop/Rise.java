package prem.oop;

// hierarchy inheritance

public class Rise 
{
	public static void main(String[] args) 
	{
		Dealer d=new Dealer();d.produce();d.oneToAccess();
		Retailer r=new Retailer();r.produce();r.oneToService();
	}
}
class Manufacturer
{
	public void produce()
	{
		System.out.println("Bajaj Produce Cruise Models");
	}
}
class Dealer extends Manufacturer
{
	public void oneToAccess()
	{
		System.out.println("Dealer provides with 6Percent tax");
	}
}
class Retailer extends Manufacturer
{
	public void oneToService()
	{
		System.out.println("Provides atleast 5 free services");
	}
}