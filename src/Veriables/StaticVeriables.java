package Veriables;



public class StaticVeriables {
	// common info, maintainace, memory saves
	// Value of static variable can directly change / it can be changed with the help of object also.
	//although sataic variable value fixed for overall class, in method if we need the change of value for perticular method then we could change woth obj.
	
	
	int empid;
	String name;
	static int  dep= 7;
	static int dep1;
	
	public void display() {
		System.out.println("employee id- "+empid);
		System.out.println("employee name- "+name);
		System.out.println("employee dep- "+dep);
		
	}
	public void display1() {
		System.out.println("employee id- "+empid);
		System.out.println("employee name- "+name);
		System.out.println("employee dep1- "+dep1);
		
	}
	
public static void main(String[] args) {
	

	StaticVeriables ob1 = new StaticVeriables();
	 ob1.empid=109;
	 ob1.name="ABC";
	 ob1.display();
	 
	 System.out.println("==============================================================");
	 StaticVeriables ob2 = new StaticVeriables();
	 ob2.empid=110;
	 ob2.name="XYX";
	 // dept for this method can be changed... ob reference
	 ob2.dep=8;
	 ob2.display();
	 System.out.println("==============================================================");
	 StaticVeriables ob3 = new StaticVeriables();
	 ob3.empid=111;
	 ob3.name="ZRT";
	 ob3.display();
	 System.out.println("*********************************************************************");
	 System.out.println("Static veriable value assigned from object");
	 StaticVeriables obx = new StaticVeriables(); // ob1,ob2 take any ref....
	 obx.staticValueCanbeChangedWithObj();
}	

public void staticValueCanbeChangedWithObj() {
	StaticVeriables ob4 = new StaticVeriables();
	 ob4.empid=100;		
	 ob4.name="shyam";
	 ob4.dep1=11;
	 ob4.display1();
	
	 System.out.println("==============================================================");
	 StaticVeriables ob5 = new StaticVeriables();
	 ob5.empid=110;
	 ob5.name="Ram";
	 // dept for this method can be changed... ob reference
	 ob5.display1();
	 System.out.println("==============================================================");
	 StaticVeriables ob6 = new StaticVeriables();	
	 ob6.empid=109;
	 ob6.name="Nath";
	 ob6.display1();
	 
	
}
	
}
