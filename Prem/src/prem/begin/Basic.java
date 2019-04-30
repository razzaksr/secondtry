package prem.begin;

/*
 * Type casting:
 * destinationVar=(destType)srcVar;
 */

public class Basic {
public static void main(String[] args) {
	char m1='W',m2=100;int k=90;
	System.out.println((int)m1);
	System.out.println((int)m2);
	System.out.println((char)k);
	int result=(m1*k)/m2;
	System.out.println((char)result);
}
}
