package JavaBasic;

public class JavaLoops {
	
	
	public static void main(String[] args) {
		  
//		int i = 1;    // Print 1 to 10 num
//		 
//		while(i<=10) {
//			System.out.print(i +" ");
//			i++;
//		}
//		
//		
		
//		// 
//		int A = 2;
//		while (A<=100) {
//			System.out.print(A+" ");
//			
//			A= A+2;
//		}
		
		// Heading
		Start();
		
		// Middle
		for(int i=0; i<10;i++) {
			
			for(int j=0; j<i; j++) {          // Before last star loop 
				System.out.print("*");
				
			}
			System.out.println("*");   // Last star and increase 1 more value
		}
		// End
		End();
		
		
	}
	
	public static void Start() {
		for(int a=0; a<=10;a++) {
			System.out.print("Start"+" ");
		}
		
	}
     public static void End() {
    	 for(int B = 0; B<=10;B++) {
    	 
    	 System.out.print("End"+" ");
     }
    	 
     }           
		
     
}
