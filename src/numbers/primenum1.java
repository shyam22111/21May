package numbers;


public class primenum1 {
	
public static void main(String[] args) {
	int i = 18;
	int ref = 0;
	for(int j=1;j<i-1;j++) {
		if(i%j==0) {
			ref= ref+1;
		} 
	}if(ref>1) {
		System.out.println(i+" = this is not prime number");
	}
	else {
		System.out.println(i+" =This is  prime number ");
	}
}
}
