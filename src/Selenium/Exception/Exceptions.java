package Selenium.Exception;



public class Exceptions {
	static int a=10;
	static String s =null;
	public static void main(String[] args) {
		
	
		System.out.println("program started");
		
		try {
			ArithematicException();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Arithematic Exception handled");
			System.out.println(a/5);
		}
		
		
		try {
			 NullPoint();
		} catch(Exception e1) {
			e1.printStackTrace();
			
			
		}  finally {
			System.out.println(s);
		}
		
		try {  NumberFormat();
			
		} catch (Exception e) {
			 System.out.println("Can not converted into char to int");
		}
	   
	    try { ArrayOutOfBond();
			
		} catch (Exception e) {
			System.out.println("create another method and call it");
		}
	    
	    
	    System.out.println("program closed");
		
	}
	public static void ArithematicException() {
		
			
			int c=a/0;
			System.out.println(c);
	}
		
	public static void NullPoint() {
     //		NullPointerException
			
			System.out.println(s.length());
		
	}
	
	public static void NumberFormat() {
		
		String st = "shy";
		int in=Integer.parseInt(st);
		System.out.println(in);
	}

	public static void ArrayOutOfBond() {
					
		int a []=new int[5];
		a[10]=12;
					
	}
			

		

	}

