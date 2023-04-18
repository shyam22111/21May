package String;


public class string {

	public static void main(String[] args) {
		
		// constant String pool area 
	    String s = "shyam";         // single memory 
		String t ="shyam";          // two veriable s=t="shyam";
		
		s.concat(s);
		
	    s=  "shyam narwade";     
	    System.out.println(s);    // now s pointing towords "shyam narwdae " but still "Shyam" obj present.
		
		int a=10;        //
		 a= 34;           // same memory change value
		
//***********************************************************************************************
		// Non constant String pool area 
		StringBuffer C = new StringBuffer("RAM");  // two memory 
		StringBuffer r = new StringBuffer("RAM");  // two veriable t="shyam";  s="shyam";
		System.out.println(C);
		System.out.println(r);
		
		
		
		
		
		
		
	}
	
	
	
}
