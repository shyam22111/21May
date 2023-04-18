package JavaBasic;

public class ArrayMath {
	
	
	public static void main(String[] args) {
		int SUM1=0;
		
		int a[]= {12,34,45};
		
		int SUM= 0;
		for(int i=0; i<3; i++) {
			SUM=SUM+a[i];
		} 
		System.out.println(SUM);
		
		
		int b[][]= {{23,65,37},{98,34,65}};
		
		for(int c=0; c<2; c++) {
			for(int d=0; d<3;d++) {
				
				System.out.print(b[c][d]+" ");
			} System.out.println();
		}
		
		
		
	}
}
