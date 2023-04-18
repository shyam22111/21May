package JavaBasic.ForLop;

public class StarPatternOne
{

	public static void main(String[] args)
	{
	
		for(int a=1; a<=10; a++) 
		{
			for(int b=1; b<=10;b++)
			{
				if(a>=1 && b==5 ||b==4 && a==1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			} System.out.println();
			
		}
		
		for(int c=1; c<=10;c++) 
		{
			System.out.print("*");
		}

	}

}
