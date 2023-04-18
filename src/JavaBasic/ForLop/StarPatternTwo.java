package JavaBasic.ForLop;

public class StarPatternTwo 
{

	public static void main(String[] args)
	{
		for(int a=1; a<=10; a++) 
		{
			for(int b= 1; b<=10;b++) 
			{
				//(a==1 && b<=5) ||    || ( a==10 && b>=1)  
				if(  (a>=1 && b==5)  )
				{
				System.out.print("*");
			    } 
				else 
			    {  System.out.print(" ");
			
			   
			    }  System.out.println();
		}
		
	

	}

}
}