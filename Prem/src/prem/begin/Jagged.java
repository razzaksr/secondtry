package prem.begin;

public class Jagged 
{
	public static void main(String[] args) 
	{
		double[] sample={4.5,2.3,9.1};
		double[] simple={11.2,6.3,9.0,12.5,5.6};
		double[] model={9.9,2.3,6.8,4.5};
		
		double[][] overall={sample,simple,model};
		
		for(int array=0;array<overall.length;array++)
		{
			for(int index=0;index<overall[array].length;index++)
			{
				System.out.print(overall[array][index]+" ");
			}
			System.out.println();
		}
	}
}
