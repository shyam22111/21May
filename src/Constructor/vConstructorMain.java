package Constructor;

public class vConstructorMain {

	public static void main(String[] args) {
		
		
		// initialization by object aproch 1 
		// not good approch n number object
		
//		vConstructor st1= new vConstructor();
//		st1.roll_no=101;
//		st1.sname="Shyam";
//		st1.grade='A';
//		st1.display();
//		
//		System.out.println("..................................");
//		
//		
//		// initialization by method 2 approch 
		// for initialization we have to call method and pass the parameter
		// if n object n method require.. as we at object creation value not initialized
//		
//		vConstructor st2= new vConstructor();
//		st2.GetValueMethod(101, "Shyam", 'a');
//		st2.display();
//		
		System.out.println("..................................");
		
		// Initialization by using constructor 3rd approch 
		// good practice directly pass parameter
		// Specially designed for initialization obj and veriable 
		vConstructor st3= new vConstructor(101,"Shyam",'A');
		st3.display();
		

	}

}
