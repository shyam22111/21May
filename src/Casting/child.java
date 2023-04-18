package Casting;

public class child extends parent {

	public void m1() {
		System.out.println("m1 method from child class");
	}
	
	public  void m2() {
		System.out.println("m2 method child class");
	}
	
	public static void m3() {
		System.out.println("Satic method from child");
		
	}
	public void name() {
		System.out.println("shyam ok");
		
	}
	
    public static void main(String[] args) {
    	child c = new child();
    	c.m1();
    	c.m2();
    	c.m3();
    	System.out.println("............................................");
    	
    	parent p1 = new parent();
    	p1.m1();
    	p1.m2();
    	p1.m3();
		System.out.println("/.................................................");
    	parent p = new child();
    	p.m1();
    	p.m2();
    	p.m3(); // p3 static s we can not overide ......
    	// p.name cant access
    	
    	System.out.println(".................................");
	}
	
	
}
