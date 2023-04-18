package object;

public class objects {
	public static void main(String[] args) {
		
		String S ="Shyam";
		String H= "Shyam";
		
		String Y = new String("Narwade");
		String A = new String("Narwade");
		
		
		System.out.println(S==H);//true // constant string pool area. duplicate object are not allowed. same information indicated by differnet object.(constant pool)
		System.out.println(Y==A);//false // Non constat pool area new(seperate) memory allocation. so not same  
		
		objects abc = new objects();
		 abc.Shyam();
		 abc.Eat();
		 abc.increment();
		 
	}
	
	  public void Shyam() {
		
		int a= 10;
		int b=20;
		int sum= a+b;
		System.out.println(sum);
		System.out.println("manish");
		System.out.println("pratap");
		
	}
	  
	  public void Eat() {
		  System.out.println("I am Eating ");
		  
	  }
	  
	  public void increment() {
		  int a = 10;
//		   a++;
//		   ++a;
		  System.out.println(++a);
		  
		  
		
	}
	
	
    
}

   
