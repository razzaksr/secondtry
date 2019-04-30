package prem.oop;

/*
 * Encapsulation:
 * a class contains var/objects and methods
 * 
 * especially var/objects are private and u can access those private members 
 * using public methods 
 */

public class West 
{
	public static void main(String[] args) 
	{
		Core c=new Core();//c.num1=34;c.num2=89;
		c.setNum1(34);c.setNum2(89);
		c.operate();
	}
}
class Core
{
	private int num1,num2;
	private double result;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public void operate()
	{
		result=num1*num2;
		System.out.println(result);
	}
}