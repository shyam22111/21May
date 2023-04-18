package JavaBasic;



public class Array {  
	
	
	//IMP- {{23,45,67},{45,78,96}}; in this condition i= 2 and j= 3    
	// So in actual for loop i value 0 to 1 so i<2 orher out of bond exception.
	// similarly j<3 because index staart at 0 sooo take n-1.

	
	// Arrays are used to store the multiple sets of data having same Data Type 
	// Arays are fixed in size , Not growable in nature 
	// Array index starts from 0 and ends at n-1.
	
	
	public static void main(String[] args) {
		
//		int a[]= new int [6];
//		
//		a[0]=145;
//		a[1]=15;
//		a[2]=14;
//		a[3]=16;
//		a[4]=8;
//		a[5]=1;
//	
//		for (int i=0; i<=5; i++) {
//		System.out.println(a[i]);
//		}
//		
		int z[][]= {{98,65,9},{34,76,67}};
		for(int p=0;p<z.length;p++) {  // if we dont know lenght then length method
			for(int q=0;q<z[p].length;q++) {
				System.out.println(z[p][q]);
				
			
			}
		}
		
		}
		
	
}
