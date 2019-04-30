package prem.language;

import java.io.IOException;

public class TestProcess 
{
	public static void main(String[] args) throws IOException 
	{
		Runtime runObject=Runtime.getRuntime();
		Process proObject=runObject.exec("mspaint");
	}
}
