package prem.threads;

public class Flow 
{
	public static void main(String[] args) 
	{
		Movie mov=new Movie();
		Thread t1=new Thread(mov,"Aravind");
		Thread t2=new Thread(mov,"Barani");
		Thread t3=new Thread(mov,"Covalan");
		Thread t4=new Thread(mov,"Dinesh");
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Movie implements Runnable
{
	public void enquiry()
	{
		System.out.println(Thread.currentThread().getName()+" enquiring amount");
	}
	public void getTicket()
	{
		System.out.println(Thread.currentThread().getName()+" Got the ticket");
	}
	@Override
	synchronized public void run() 
	{
		enquiry();
		if(Thread.currentThread().getName().equals("Barani"))
		{
			try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Thread.currentThread().getName().equals("Aravind"))
		{
			Thread.currentThread().stop();
		}
		getTicket();
	}
}