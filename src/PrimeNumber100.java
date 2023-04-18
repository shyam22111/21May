
public class PrimeNumber100 {

	public static void main(String[] args) {
	
		for(int i=1;i<1000;i++){
			int Ref=0;
		   for(int j=1;j<i-1;j++) {  
			   if(i%j==0) {
				   Ref=Ref+1; // Ref -consider this is infection... once inficted till this for loop infection increased till loop coplication.
				  
				   }  
		   } 
		   if(Ref>1) { // infection obiviously >1 not enter....
			   System.out.println(i+" = is not a prime number");
		             }
		   else {
			   System.out.println(i+" This is a prime number");
		        }
	   }
	}
}
