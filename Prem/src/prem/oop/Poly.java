package prem.oop;

/*
 * Method overloading: 
 * same method name but different parameters
 */

public class Poly 
{
	int[] cost={8900,12000,6700,3000,7800,6900};
	public void display()
	{
		for(int c:cost)
		{
			System.out.println(c);
		}
	}
	public void search(int amount)
	{
		System.out.println("Mobiles available with ur: "+amount);
		for(int c:cost)
		{
			if(c<=amount)
			{
				System.out.println(c);
			}
		}
	}
	public void search(int amount1,int amount2)
	{
		System.out.println("Mobiles available with ur: "+amount1+" and "+amount2);
		for(int c:cost)
		{
			if(c<=amount2&&c>=amount1)
			{
				System.out.println(c);
			}
		}
	}
	public static void main(String[] args) 
	{
		Poly p=new Poly();p.display();
		p.search(5000);p.search(5000, 10000);
	}
}
