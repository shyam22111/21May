package Method;

public class MainClass {

	public static void main(String[] args) {
		RegularClass ob = new RegularClass();
		ob.method1();
		ob.method5(1, "shyam");	
		
		String  m2 =ob.method2();
		int     m3=ob.method3();
		boolean m4 =ob.method4();
		int     m6=ob.method6(0, false);
		String  m7=ob.method7(0, 'c');
		
		
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m6);
		System.out.println(m7);
		
		
		// imp-- Method with arguments generally , which parameter you are passing should have logic dependent on that . But remember not manditory.
		

		
		// Now you got idea about method overloading change only sequence, number of argument, change data type.
		
	}

}
