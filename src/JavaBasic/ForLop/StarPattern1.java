package JavaBasic.ForLop;

public class StarPattern1 
{
  public static void main(String[] args) 
  {
	
	  for (int a=1; a<=10;a++) 
	  {
		  
		  for(int b=1; b<=a; b++) 
		  {  // B less than a increament ..........
			   System.out.print("*");
		  }
		  System.out.println();
	  }
        
	  
	  for (int a=1; a<=10;a++)
        {
		  
		  for(int b=10; b>=a; b--)
		  {  // B greater than a decrement ..........
			  
			   System.out.print("*");
		  } 
		  System.out.println();
        }
	  
  }
	
	
	
}
