package oop;

import oop.Cookie.Version;

public class NonStatic 
{
	public static void main(String[] args) 
	{
		Cookie cook=new Cookie();
		cook.flavor="Eclairs";cook.display();
		Version ver=cook.new Version();
		ver.api();
	}
}
class Cookie
{
	String flavor;
	public void display(){System.out.println("Ur flavour: "+this.flavor);}
	class Version
	{
		public void api()
		{
			System.out.println("Version: "+flavor+" exists in Android");
		}
	}
}