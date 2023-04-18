package String;

public class abc {
	protected static void main(String args[]) {
	String name = "Shyam";
	String Reverse ="";
	  String a ="xyz";
	 System.out.println(a);
	 
	for(int i =name.length()-1; i>=0;i--){
		Reverse= Reverse+ name.charAt (i);
	}
	  System.out.println(Reverse);
	  abc ob = new abc();
       ob.PQR();
       
	}
	public  void PQR() {
		System.out.println("non static method exicuted");
		def();
		geh();
		ijk();
	}
	final static void def() {
		System.out.println("static method exicuted");
	}
       private static void geh() {
    	   System.out.println("non static method accessed static method");
       }
    void ijk() {
    	System.out.println("non ststic method accessed by non static method");
    }
    final int a =10;
 }
