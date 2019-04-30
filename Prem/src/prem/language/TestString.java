package prem.language;

public class TestString 
{
	public static void main(String[] args) 
	{
		String object1=" Prem Kumar ";// literal
		String object2=new String("Prem");//  non literal
		
		System.out.println(object1.length());
		System.out.println(object2.length());
		object1=object1.trim();// immutable
		System.out.println(object1.length());
		System.out.println(object1.equals("prem kumar"));
		System.out.println(object1.equalsIgnoreCase("prem kumar"));
		System.out.println(object1+" "+object2);
		object2=object2.toLowerCase();object1=object1.toUpperCase();
		System.out.println(object1+" "+object2);
		System.out.println(object1.charAt(5));
		System.out.println(object1.substring(2,7));
		System.out.println(object2.getBytes());
	}
}
