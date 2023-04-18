package FinalKeyword;
//Final Keyword:- 
//==================================
//
//Final Keyword can be add with the
//=> Variables 
//=> Methods
//=> Classes
//'
//
//Variables :- if variables are provided with final keyword then you can not change the value of the variable.
//
//Methods:- If methods are provided with final keyword then we can not override  it in child classes.
//
//Class:- If classes are provided with final keyword then we can not extend it by another class.
//
//
//
//Program:- 
//============
//
//public  class FinalKeyword {
//
//	final int speed=40;
//	public static void main(String[] args) {
//		
//		FinalKeyword fk = new FinalKeyword();
//		//fk.speed=100;
//		System.out.println(fk.speed);
//	}
//}
//
//
//
//
//						Interface and Implementation
//					       ===============================
//
//Interface:- 
//=====================================================================
//
//
//Interface :- It is one of the oops concept. 
//	     It is 100 %  abstract in nature.
//
//
//Features:- Interface contains final and static variable.
//	   Methods declared inside interface are public and abstract by default.
//	   Constructor concept is not present inside the interface.
//	   Interface supports multiple inheritance.
//	   object of interface can not be created.
//
//Implementation Class:- 
//     	   A class which provides definition for all the incomplete methods which are present in interface with the 
//	   help of implementation keyword.
//	   At the time of impplementation declare the method with public access specifier.
//
//Note:- 
//====================
//=> A class can extends another class
//=> An interface extends another interface
//=> A class implements interface.
//
//
//
//Program :-
//============
//
//public interface ABC {
//
//	int a=20;
//	void m1();  // public and abstract
//	public abstract void m2();  // can declare like this also both are valid
//	
//	void sum (int x, int y);   // method with parameters and no return type
//	
//	int difference(int x, int y);  // method with parameter and return type
//	
//}
//
//
//public class Test implements ABC {
//
//
//	public void m1() {
//		System.out.println(a);
//	}
//
//	public void m2() {
//		System.out.println(a);
//	}
//	
//	public void sum(int x, int y) {
//		System.out.println(x+y);
//	}
//	
//	public int difference(int x, int y) {
//		
//		return (x-y);
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		
//		Test t = new Test();
//		t.m1();
//		t.m2();
//		t.sum(10, 40);
//		System.out.println(t.difference(50, 25));
//	}
//
//}
