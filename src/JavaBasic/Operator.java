package JavaBasic;


public class Operator {

	
	public static void main(String args []) {
		 
//	 there are 5 types of Operator ( LIRAA )
		
//		 1) Arithmetic operators -->  + - * / %
//	     2) Relational Operators (Comparison operators)--->   == < >  <=  >=  !=
//	     3) Logical operators   &&   ||    !
//	     4) increment/decrement operators  ++  --
//       5) Assignment operators  =
		 
		
//		 logical Operator = true, and false;
//		 Incremental Operator= ++ or --
//	     Relational Operator = ==, > < , >=,<= !=
//	     Arthamatic operator = +,-,/,%
//	     Assignment Operator= 
		
		
		 int A;
		 int B;
		  
		 A= 20;
		 B= 25; 
		 
		 
		 Boolean X = true;
		 Boolean Y = false;
		
		 
//		 Logical Operators 
		  System.out.println("X  and Y :" + (X && Y));
		  System.out.println("X Or Y :" + (X || Y)) ;
		  System.out.println("X is not equals to Y" +(X=!Y));
		  
		  
//		  Incremental operator
		  A++;
//		  A= A+1;
		  B++;
//		  B=B+1;
		   
		  System.out.println(" The value of a k is After increment :" + A);
		  System.out.println("The value of B after increment :" + B);
		  
		  
		  
//		  Retational Operator 
		  
		  System.out.println("A is equals to B: " + (A==B));
          System.out.println(" A is Greater than B :" + (A>B));
          System.out.println(" A is Less than B :"+(A<B));
          System.out.println(" a is greater than or equal to B:"+(A>=B));
          System.out.println("A is Less than or equals to B : "+ (A<=B));
          
          
//           Assignment Operator
          int c = 12;
          
          
//          Arthmatic Operation
          
          System.out.println("Sum of A and B is :"+(A+B));
          System.out.println("Sub of A and B is : "+(A-B));
          System.out.println("mul of A and B is :" + (A*B));
          System.out.println("div of a and B is "+(A/B));
          System.out.println("moduloud of A and B is :"+ (A % B));
		
}
}