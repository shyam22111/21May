package SpecialLoops;

public class StarPattern4 
{

	public static void main(String[] args)
	{
		// Star pattern increment but from right side 1,2,3,.......
		// We require 2 pattern space and star so 3 for loops require...
		for(int a=1; a<=10;a++) 
		{
			for(int b=a; b<=9; b++) 
			{
				System.out.print(" ");
			} 
			
			// program continue on same line after 9 (print statement)
			for(int c=1; c<=a; c++) 
			{
				System.out.print("*");
			} System.out.println();
		}

	}

}
