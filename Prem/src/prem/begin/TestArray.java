package prem.begin;

/*
 * for each: display, search
 * syntax:
 * for(type tempVar:srcVar)
 * {
 * tempVar
 * }
 */

public class TestArray {
	public static void main(String[] args) {
		short[] bags={235,120,900,435,100};//   0 to 4
		System.out.println(bags.length);
		/*int index;
		for(index=0;index<bags.length;index++)
		{
			System.out.println(bags[index]);
		}*/
		for(short t:bags)
		{
			System.out.println(t);
		}
	}
}
