
public class PrimeNumber {

	public static void main(String[] args)
	{
		int a= 56 ; //2-77
		int Ref = 0;
		for(int i=2; i< a-1;i++)
		{
			if(a%i==0)
			{	
				Ref=Ref+1;
			}	
			}
				if(Ref==0) {
					System.out.println(a+" =This is a prime number");
				}
				else {
					System.out.println(a+" =This is not a prime number");
				}
	     } 	
		}
		
		
		
