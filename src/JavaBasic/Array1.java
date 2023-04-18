package JavaBasic;

public class Array1
{
	
	// Sum of multi dimensional Array
	
	
	public static void main(String[] args) 
	{
		
		int a[][]= new int [3][2];
		a[0][0] =100;
		a[0][1] =200;
		a[1][0] =300;
		a[1][1] =400;
		a[2][0] =500;
		a[2][1] =600;
		
		int sum1= 0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++) 
			{
			sum1= sum1+a[i][j];	
		}
		
		}System.out.print(sum1);
	}

}
