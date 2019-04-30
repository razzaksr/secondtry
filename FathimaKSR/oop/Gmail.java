package oop;

public class Gmail extends Google
{
	public boolean verify(String u,String p)
	{
		if(u.equals(getUsername())&&p.equals(getPassword()))
		{
			System.out.println("Authorised login");
			return true;
		}
		else
		{
			System.out.println("Unauthorised login");
			return false;
		}
	}
	public void sendEmail(String to, String msg)
	{
		System.out.println(msg+" has sent to "+to+" by "+getUsername());
	}
	public static void main(String[] args) 
	{
		Gmail gm=new Gmail();
		gm.setUsername("kokila@gmail.com");gm.setPassword("ksrkokila");
		if(gm.verify("kokila@gmail.com", "ksrkokila"))
		{
			gm.sendEmail("fathima@gmail.com", "Tomorrow we gonna bunk");
			gm.features();
		}
		else
		{
			System.out.println("Can't access anything");
		}
	}
}
