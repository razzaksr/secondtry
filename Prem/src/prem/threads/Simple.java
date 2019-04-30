package prem.threads;

public class Simple 
{
	public static void main(String[] args) 
	{
		Camp c=new Camp();
		Thread t1=new Thread(c,"Gowtham");
		Thread t2=new Thread(c,"Kumar");
		Thread t3=new Thread(c,"Prem");
		Thread t4=new Thread(c,"Vinay");
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Camp implements Runnable
{
	public void pick()
	{
		System.out.println("Pick any Skillset to get a job "+
	Thread.currentThread().getName());
	}
	public void eligible()
	{
		System.out.println("Candidates who has Java are eligible in TCS "+
				Thread.currentThread().getName());
	}
	@Override
	synchronized public void run() 
	{
		pick();eligible();
	}
}