package Abstract;

import String.abc;
import String.string;

public class concreteClass extends shyam{
	protected void p() {
		System.out.println("extended method exicuted");
	}
	public static void main(String[] args) {
		concreteClass conc = new concreteClass();
		conc.print();
		conc.p();
	}
	
	

}
