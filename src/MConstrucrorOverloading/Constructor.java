package MConstrucrorOverloading;


public class Constructor {

	
	Constructor(){
		System.out.println("No argument Constructor");
	}	
	Constructor(int a){
		int b=a;
		System.out.println(b);
		
	}	
	Constructor(int a, String s){
	   int rollNo=a;
	   String name =s;
	   System.out.println("Name of student is = "+name);
		System.out.println(" And rollno of student is= "+rollNo);
	}	
	
	public static void main(String[] args) {
		
		Constructor co = new Constructor();
		Constructor co1 = new Constructor(21);
		Constructor co2 = new Constructor(12,"Shyam");
		
	}
	
}
