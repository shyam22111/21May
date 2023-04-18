package Constructor;

public class vConstructor {
	
	int roll_no;
	String sname;
	char grade;
	
	
	
	vConstructor(int a, String b, char c){
		roll_no = a;
		sname= b;
		grade =c;
		
	}
	
    public  void  GetValueMethod( int e, String f, char g) {
    	roll_no = e;
		sname= f;
		grade =g;
	
}
    
    //print values 
    public void display() {
    	System.out.println("The Student Rollno is "+ roll_no);
		System.out.println("The Student name is "+ sname);
		System.out.println("The Student grade is "+ grade);
    }
}
