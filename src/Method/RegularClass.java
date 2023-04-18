package Method;


public class RegularClass {
	
     // maintainace security redability....
	// Call all method in main class 
	
	public void method1() {
		System.out.println("void method1 execuited with no argument called");
		System.out.println("--------------------------------");
	}
	
	public String method2() {
		 String name ="Method2 exicuted with String data type :My name is shyam";
		 System.out.println("--------------------------------");
		 return name;
		
	}
	public int method3() {
		System.out.println("Method3 exicuted with int data type");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("--------------------------------");
		return c;
		
	}
	public boolean method4() {
		System.out.println("Method4 exicuted with boolean data type");
		boolean d=1>10;
		System.out.println("--------------------------------");
		return d;
	}
	public void method5(int s,String t) {
		System.out.println("Method5 exicuted with no return data type but int and String args "+"\r\n"+" method calling time method ask for arguments int and string "+"\r\n"+" As we provide argumnt it is void type only exicute "+"\r\n"+" and perform action which logic present inside method");
		System.out.println("*imp* "+"\r\n"+" Remember method with argument means it require arguments to call this method, "+"\r\n"+" dont misunderstood that this method only accepts argument type of logic");
	    System.out.println("in this method also contain extra logic rather than passing parameter");
	    System.out.println("--------------------------------");
	}
	
	public int method6(int j, boolean b) {
		System.out.println("Method6 exicuted with int return data type but int and boolean args "+"\r\n"+" method calling time method ask for arguments int and string "+"\r\n"+" As we provide argumnt it exicute and provide retun value int as well extra logic present in method "+"\r\n"+" and perform action which logic present inside method");
		System.out.println("*imp* "+"\r\n"+" Remember method with argument means it require arguments to call this method, "+"\r\n"+" dont misunderstood that this method only accepts argument type of logic");
	    System.out.println("in this method also contain extra logic rather than passing parameter");
	    int z=45;
	    System.out.println("--------------------------------");
		return z;
	}
	public String method7(float f,char c) {
		System.out.println("Method7 exicuted with String return data type but int and boolean args "+"\r\n"+" method calling time method ask for arguments int and string "+"\r\n"+" As we provide argumnt it exicute and provide retun value int as well extra logic present in method "+"\r\n"+" and perform action which logic present inside method");
		System.out.println("*imp* "+"\r\n"+" Remember method with argument means it require arguments to call this method,"+"\r\n"+" dont misunderstood that this method only accepts argument type of logic");
	    System.out.println("in this method also contain extra logic rather than passing parameter");
	    String  StringReturn = "Congratulation all method with arguments as well return type methods understood";
	    System.out.println("--------------------------------");
	    return StringReturn;
	}
}
