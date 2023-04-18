package SpecialLoops;

public class StarPattern5 {

	public static void main(String[] args) 
	{
		// Star pattern Decreament from right side...
       // We know for one pattern we require 2 for loop and for 2 patten we require 3 for loop
		//one Space and another one Star
		
		for(int a=1; a<=10; a++) 
		{
			for(int b=1; b<a; b++) 
			{
				System.out.print(" ");
			} 
			
			
			for(int c=a; c<=10; c++) 
			{
				System.out.print(" *");
			} System.out.println();
		}
		
	}

}
