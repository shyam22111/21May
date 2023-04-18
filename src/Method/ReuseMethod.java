package Method;



public class ReuseMethod {
// veriable declaration 
	// class level veriable instance veriable. witch obj can access only
	String company;  
	String empID;
	int Salary;
	String Dept;
	
	
	public void display() {
		System.out.println("name of compnny = "+company);
		System.out.println("name of EmpId = "+empID);
		System.out.println("name of salary = "+Salary);
		System.out.println("name of Dept ="+Dept);
	}
	public static void main(String[] args) {
		ReuseMethod e1= new ReuseMethod();
		// initialization of object 
		e1.company="Accenture";
		e1.empID = "A02019137";
		e1.Salary= 76000;
		e1.Dept ="QA";
		e1.display();
		System.out.println("........................................");
		e2();
		
	
	}
	public static void e2() {
		ReuseMethod e2= new ReuseMethod();
		e2.company="TCS";
		e2.empID = "T02019137S";
		e2.Salary= 56000;
		e2.Dept ="SQA";
		e2.display();
		System.out.println("........................................");
		e2.M3();
	}
	public void M3() {
		System.out.println("This is not good approch... lengthy code... Use constructor directly initialize  object");
	}
	  
		
}
