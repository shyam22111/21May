package SpecialLoops;

import java.util.Iterator;

public class Special 
{
	public static void main(String[] args) 
	
	
	// Rectangle
	{
		for(int a=1; a<=10;a++) 
		{
			for(int b=1; b<=10; b++) 
			{
				if(a==1 && b>=1 || a==10  && b<=10) 
				{
				System.out.print("*");
				}
				
			} System.out.println();
				
			 for(int c= 1; c<=10; c++) 
			{
				if(a>=1 && c==1 || a>=1 && c==10 ) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				} 
			}
		}System.out.println();
		

		
		
	}
	}
