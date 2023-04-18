package numbers;



public class methods {
	
	public static void main(String[] args) {
		methods math = new methods();
		math.sum(10);
	
		
	}
	
	public void sum(int b) {
		int num =b ;
		long ref =0;
		for(long i=num;i>=1;i--) {
			ref = ref+i;
		} System.out.println("sum of "+ num +" = "+ ref);

	}
	

}
