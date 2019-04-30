package oop;

public class MembersAsStatic 
{
	public static void main(String[] args) 
	{
		Machine fathima=new Machine();
		fathima.eachDebit=4500;fathima.getMoney();
		Machine kokila=new Machine();
		kokila.eachDebit=8500;kokila.getMoney();
		Machine kamali=new Machine();
		kamali.eachDebit=10000;kamali.getMoney();
		System.out.println(kamali.machineAmount);
		System.out.println(fathima.machineAmount);
		System.out.println(kokila.machineAmount);
		System.out.println(Machine.machineAmount);
	}
}
class Machine
{
	int eachDebit;
	static int machineAmount=20000;
	public void getMoney()
	{
		if(machineAmount>=this.eachDebit)
		{
			if(eachDebit%500==0||eachDebit%2000==0)
			{
				machineAmount-=this.eachDebit;
				System.out.println("You can get "+this.eachDebit);
			}
			else
			{
				System.out.println("Denomintion not matched");
			}
		}
		else
		{
			System.out.println("Cash cannot dispensed");
		}
	}
}