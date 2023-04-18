package numbers;

public class Fibnocci {
	public static void main(String[] args) {
	
		// 1,2,3,5,8,13,21........
		int ref = 0;
		for(int i=1;i<50;i++) {
			for(int j=1;j<i-1;j++) {
			 ref = ref+j;
			}
			System.out.println(ref);
		}
		
	}

}
