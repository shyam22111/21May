package ThisAndSuper;
//This  & Super Keyword:- 
//============================================================================================
//
//This Keyword:- To access the global variable of the same class this keyword is used.
//Super Keyword:- Super keyword is used to access the global variables of the super class. Inheritance is compulsory to use super keyword.
//
//## Program This Keyword.
//==================================================================
//public class thisKeywordexample {
//	
//	int x;
//	int y;
//	
//	int a = 10;
//	public void test() {
//		int a =20;
//		System.out.println(a);
//		System.out.println(this.a);
//	}
//	
//	public void testa() {
//		int a =30;
//		System.out.println(a);
//		System.out.println(this.a);
//	}
//	
//	
//	public void sum (int x, int y) {
//		this.x=x;
//		this.y=y;
//		System.out.println(x+y);
//	}
//	
//	public static void main(String[] args) {
//
//		thisKeywordexample tk = new thisKeywordexample();
//		tk.test();
//		tk.testa();
//		tk.sum(50, 50);
//		
//	}