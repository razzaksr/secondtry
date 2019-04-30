package prem.threads;

public class Interthread 
{
	public static void main(String[] args) 
	{
		Trekking tr=new Trekking();
		Picnic p=new Picnic(tr);
		Thread t1=new Thread(tr,"Prem");
		Thread t2=new Thread(p,"Kumar");
		t1.start();t2.start();
	}
}
class Trekking implements Runnable
{
	Integer time=new Integer(5);
	public void doTrek()
	{
		System.out.println(Thread.currentThread().getName()
				+" Trekking at: "+time);
	}
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()
				+" came for trekking "+time);
		synchronized (time) 
		{
			if(time<8)
			{
				try {
					time.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			doTrek();
		}
	}
}
class Picnic implements Runnable
{
	Trekking trek;
	public Picnic(Trekking t)
	{
		trek=t;
	}
	public void experienceNature()
	{
		System.out.println(Thread.currentThread().getName()+" came for nature");
	}
	@Override
	public void run() 
	{
		experienceNature();
		synchronized (trek.time) 
		{
			if(trek.time<8)
			{
				trek.time.notify();trek.time=9;System.out.println("Picnic people helps them");
			}
		}
	}
}