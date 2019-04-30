package oop;
// bean/model/business class
public class Furniture
{
	private String usage, type, name;
	private double price;
	public Furniture()
	{usage="";type="";name="";price=0.0;}
	public Furniture(String a,String b,String c,double d)
	{
		usage=a;type=b;name=c;price=d;
	}
	public String toString()
	{
		return name+" "+type+" "+usage+" "+price+"\n"; 
	}
	public void setUsage(String usage)
	{
		this.usage=usage;
	}
	public String getUsage()
	{
		return this.usage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
