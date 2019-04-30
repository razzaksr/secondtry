package oop;

public class Kart 
{
	String proName;
	int price;
	public void enquiry()
	{
		System.out.println("Ur product info: ");
		System.out.println(this.proName+" "+this.price);
	}
	public static void main(String[] args) 
	{
		Kart kokila=new Kart();
		kokila.price=3400;kokila.proName="ExternalHDD";
		kokila.enquiry();
		Kart fathima=new Kart();
		fathima.enquiry();
		Kart kamali=new Kart();
		kamali.price=800;kamali.proName="Pendrive";kamali.enquiry();
	}
}
