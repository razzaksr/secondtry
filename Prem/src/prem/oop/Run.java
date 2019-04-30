package prem.oop;

public class Run implements Alpha,Beta
{
	public static void main(String[] args) 
	{
		Run r=new Run();r.numeric();r.character();
	}

	@Override
	public void numeric() 
	{
		System.out.println("OTP comes with Numeric");
	}

	@Override
	public void character() 
	{
		System.out.println("Account type comes with character");
	}
}
interface Alpha
{
	public void character();
}
interface Beta
{
	public void numeric();
}