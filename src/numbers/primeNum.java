package numbers;

public class primeNum {
public static void main(String[] args) {
	for(int i=2;i<52;i++) {
		int ref =0;
		for(int j=1;j<i-1;j++) {
			if(i%j==0) {
				ref=ref+1;    // n divided by[ total nuber of (n-1)]
				              // if divided by multiple number...ref>1
				             // otherwise upto 1
			}
		}if(ref>1) {
			System.out.println(i+" = This is a not prime number");
		}
		else {
			System.out.println(i+" = this is a prime number");
		}
	}
}
}
