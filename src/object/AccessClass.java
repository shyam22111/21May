package object;


public class AccessClass  {

	int b= 10;
	
	static int  c = 20;
	public static void main(String[] args) {
		AccessClass ob = new AccessClass();
//		ob.name();
		ob.time();
	
	
	}
//	 public void name() {
//		
//		 int b = 30;
//		  System.out.println(this.b);
//	}
	 
	 public int time() {
		 int t = time(); 
		 
		System.out.println(t);
		return t;
	 }
	
	
} 
 
 