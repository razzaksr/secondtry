package prem.language;

public class TestCloneable implements Cloneable
{
	int alpha;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		TestCloneable test1=new TestCloneable();test1.alpha=90;
		TestCloneable test2=new TestCloneable();test2.alpha=20;
		System.out.println(test1.alpha+" "+test2.alpha);// 90 20
		test2=test1;
		System.out.println(test1.alpha+" "+test2.alpha);// 90 90
		test2.alpha=12;
		System.out.println(test1.alpha+" "+test2.alpha);// 12 12
		TestCloneable test3=new TestCloneable();
		test3=(TestCloneable)test1.clone();
		System.out.println(test1.alpha+" "+test2.alpha+" "+test3.alpha);
		test3.alpha=45;test1.alpha=33;test2.alpha=8;
		System.out.println(test1.alpha+" "+test2.alpha+" "+test3.alpha);
	}
}
