package prem.begin;

public class TestAbstract extends Books
{
	public static void main(String[] args) 
	{
		TestAbstract test=new TestAbstract();
		test.display();test.show();
	}

	@Override
	public void show() 
	{
		System.out.println("Overrided from Books");
	}
}
