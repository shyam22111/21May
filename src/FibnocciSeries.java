
public class FibnocciSeries {
	
	public static void main(String[] args) {
		
		 int num= 1;
		for(int i=0;i<100; i++) {
			num=(i+num)-1;
			int n = num+i;
			System.out.print(n+" ");
		}

	}

}
