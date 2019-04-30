package oop;

public class KsrShowroom 
{
	public static void main(String[] args) 
	{
		Furniture f=new Furniture("Home","PlyWood","Dinning",2000.0);
		
		System.out.println(f.getName()+" "+f.getType()+" "+
		f.getUsage()+" "+f.getPrice());
		
		Furniture fun=new Furniture();fun.setName("Meeting table");
		fun.setType("Steel");fun.setUsage("Office");fun.setPrice(7900.4);
		System.out.println("Office furniture details: "+fun);
	}
}
