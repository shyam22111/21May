package SpecialLoops;

public class StarPattern3
{

	public static void main(String[] args)
	{
		// Decreament Star Pattern 5,4,3,2,1.....
		// we require only one pattern * 2 for loop require...
		
		for(int a=1; a<=10;a++) 
		{
			for(int b=a;b<=10;b++) 
			{
				System.out.print("*");
			} System.out.println();
		}

	}

}
