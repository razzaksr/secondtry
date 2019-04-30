package prem.threads;
// multi task multithreading:no need of synchronized keyword at all 
public class TaskMulti 
{
	public static void main(String[] args) 
	{
		Shopping shop=new Shopping();
		Games game=new Games();
		Thread t1=new Thread(shop,"Elango");
		Thread t2=new Thread(game,"Fernandace");
		Thread t3=new Thread(shop,"Govind");
		Thread t4=new Thread(game,"Harivignesh");
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Shopping implements Runnable
{
	public void shopClothes()
	{
		System.out.println(Thread.currentThread().getName()+" buying clothes");
	}
	public void shopAccesseries()
	{
		System.out.println(Thread.currentThread().getName()+" buying extras");
	}
	@Override
	public void run() 
	{
		shopClothes();shopAccesseries();
	}
}
class Games implements Runnable
{
	public void playWetgames()
	{
		System.out.println(Thread.currentThread().getName()+" playing wet games");
	}
	public void playStation()
	{
		System.out.println(Thread.currentThread().getName()+" playing playstation");
	}
	@Override
	public void run() 
	{
		playWetgames();playStation();
	}
}