package oop;

public class Control extends Os
{
	public void specification()
	{
		System.out.println("Your desired mobile info are: ");
		details();System.out.println(getApps()+"\n"+getVendor());
	}
	public static void main(String[] args) 
	{
		Control con=new Control();con.model="YU5530";con.price=9999;
		con.setApps("YU Browser, YU Account, Google Mail, Youtube");
		con.setVendor("Android");con.specification();
	}
}
class Manufacturer
{
	String model;int price;
	public void details()
	{
		System.out.println(model+" "+price);
	}
}
class Os extends Manufacturer
{
	private String vendor, apps;

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getApps() {
		return apps;
	}

	public void setApps(String apps) {
		this.apps = apps;
	}
}