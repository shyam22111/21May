package SpecialLoops;
 
public class StarPattern2 {

	public static void main(String[] args)
	{
		// star pattern for increament 1,2,3......
		// we require only one pattern * 2 for loop require...
		for(int a=1;a<=5;a++) 
		{
			for(int b=1; b<=a;b++) 
			{
				System.out.print(a);
			} System.out.println();
		}
	}
}
