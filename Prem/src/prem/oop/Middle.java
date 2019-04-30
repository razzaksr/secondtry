package prem.oop;

public class Middle extends Froyo
{
	public void stand()
	{
		System.out.println("Stand always possitivity");
	}
	public static void main(String[] args) 
	{
		Middle mid=new Middle();mid.stand();mid.android();
	}
}
class Froyo
{
	public void android()
	{
		System.out.println("Google map enhanced with traffic");
	}
}